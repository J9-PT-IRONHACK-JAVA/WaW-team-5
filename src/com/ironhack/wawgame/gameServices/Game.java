package com.ironhack.wawgame.gameServices;

import com.ironhack.wawgame.gameObjects.Party;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.ironhack.wawgame.gameObjects.Character;
import com.ironhack.wawgame.gameObjects.Warrior;
import com.ironhack.wawgame.gameObjects.Wizard;

public class Game {

    private Integer autoincrement;

    public Game() {
        autoincrement = 0;
    }

    public Party generateRandomParty() {  // NO HACER POR AHORA
        return new Party();
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
