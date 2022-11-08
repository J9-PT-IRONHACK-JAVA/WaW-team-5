package com.ironhack.wawgame.gameServices;

import com.ironhack.wawgame.gameObjects.Party;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.ironhack.wawgame.gameObjects.Character;
import com.ironhack.wawgame.gameObjects.Warrior;
import com.ironhack.wawgame.gameObjects.Wizard;
import net.datafaker.Faker;

public class Game {

    private Integer autoincrement;

    public Game() {
        autoincrement = 0;
    }

    public Party generateRandomParty() throws IOException {
        var party = new Party();
        var faker = new Faker();
        int n=0; //inicializams la variable a 0, es el número que asociaremos a wizard o warrior

        //crear personajes aleatorios con faker
        for (int i = 0; i < 4; i++) {
            n= (int)(Math.random()+1);
            if(n==1){
                //si n=1 crear un warrior
                // crear un objeto warrior(id,name)
                var warrior = new Warrior(faker.random().nextInt(), faker.name().firstName());

                //añadir warrior a la party
                party.addCharacter(warrior);
                //copiar info de warrior al csv
                exportToCsv(warrior.getId(),warrior.getName(),(Character) warrior);
            }else{
                //n=2 crear un wizard
                //crear un objeto wizard
                var wizard = new Wizard(faker.random().nextInt(), faker.name().firstName());

                //añadir wizard a la party
                party.addCharacter(wizard);

                //copiar info de wizard al csv
                exportToCsv(wizard.getId(),wizard.getName(),(Character) wizard);
            }
        }
        return new Party();
    }

    public static void exportToCsv (int id, String name, Character character) throws IOException {
        var writer = new FileWriter("src/Party1.csv",true);
        String characterIs;

        if(character instanceof Warrior){
            characterIs = "warrior";
        } else{
            characterIs = "wizard";
        }
        writer.write (id+","+ name +","+characterIs);

        writer.close();
    }

    public Party generatePartyFromCsv(String path) throws IOException {
        var party = new Party();
        File partyFile = new File(path);
        Scanner reader = new Scanner(partyFile);
        while (reader.hasNext()) {
            String[] lineCut;
            var line = reader.nextLine();
            lineCut = line.split(",");
            if (lineCut[1].equals("warrior")) {
                var warrior = new Warrior(this.autoincrement, lineCut[0]);
                this.autoincrement++;
                party.addCharacter(warrior);
            } else if (lineCut[1].equals("wizard")) {
                var wizard = new Wizard(this.autoincrement, lineCut[0]);
                this.autoincrement++;
                party.addCharacter(wizard);
            } else {
                System.out.println("character type doesn't exist");
            }
        }
        reader.close();
        return party;
    }

    public Party generatePartyFromUserInput() { // NO HACER POR AHORA
        return new Party();
    }

    public String askSomethingToUser(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
