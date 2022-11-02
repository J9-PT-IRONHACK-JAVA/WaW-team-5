package com.ironhack.wawgame.gameServices;

import com.ironhack.wawgame.gameObjects.Attacker;
import com.ironhack.wawgame.gameObjects.Character;
import com.ironhack.wawgame.gameObjects.Party;
import java.util.ArrayList;
import java.util.Scanner;

public class Battle {
    private Party party1;
    private Party party2;
    private ArrayList<Character> graveYard;
    private int numberOfDuel = 0;

//CONSTRUCTOR
    public Battle(Party party1, Party party2) {
        this.party1 = party1;
        this.party2 = party2;
    }

//METODOS

    /* nextDuel elige un combatiente de cada party y genera un nuevo duelo entre ambos
     * Al finalizar el duelo, se envía al perdedor al graveYard. Si es empate se envía a los dos
     * Al enviarse un combatiente al graveYard, se elimina de su party
    */
    public void nextDuel() {

    //Defino los combatientes del duelo
        var combatant1 = pickCombatant (1,party1);
        var combatant2 = pickCombatant (2,party2);

    //Creo el duelo entre ambos combatientes para que luchen
        Duel duel = new Duel(combatant1,combatant2);
        duel.fight((Attacker) combatant1,(Attacker) combatant2);

    //Posibles resultados: empate o que haya un perdedor
        //En caso de que fight termina en empate, enviar los dos al cementerio y eliminarlo de sus partys
        if (duel.isTie()) {
            graveYard.add(combatant1);
            graveYard.add(combatant2);

            party1.removeCharacterOfParty (combatant1);
            party2.removeCharacterOfParty (combatant2);

        } else { //si no es empate, obtener el perdedor, enviarlo al cementerio y eliminarlo de su party
            var looser = duel.getLooser(combatant1,combatant2);
            graveYard.add(looser);
            getCombatantParty(looser).removeCharacterOfParty(looser);
        }
        numberOfDuel++;
    }

    /* getCombatantParty devuelve la party a la que pertence un Character
     * @param combatant, es el Character del que deseamos conocer que party pertenece
     * @return Party, es la party a la que pertenece combatant
     */
    public Party getCombatantParty (Character combatant) {
        for (Character character : party1.getParty()) {
            if (combatant.getId() == character.getId()) {
                return party1;
            } else { return party2; }
        }
        return null;
    }

    /* isFinished devuelve true cuando batalla entre las partys ha finalizado
     * @return true cuando el tamaño de una de las party es cero.
     */
    public boolean isFinished() {
        if (party1.getParty().size() == 0 || party2.getParty().size() == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    /* pickCombatant solicita a ambos jugadores que elija el Character con el que deasea realizar el siguiente duelo
     * @param playerNumber, es el número de jugador (1 o 2) que va a elegir combatiente para el duelo.
     * @param party, es la party del jugador
     * @return, devuelve el Character que el jugador ha elegido.
     */
    public Character pickCombatant (int playerNumber,Party party) {
        var scanner =  new Scanner(System.in);
        System.out.println("\nPLAYER " + playerNumber +":");
        System.out.println("Choose id of Warrior or Wizard to duel: "); //Elegirlo por iD
        // imprimir caracteres y propiedades de la party
        System.out.println(party); //pendiente de crear toString en Party
        int iDCharacter1 = scanner.nextInt();

        while (!party.characterIsInParty(iDCharacter1)) { //pendiente de crear getId en Character y characterIsInParty en Party
            System.out.println("Character iD is not in the party, please choose other");
        }
        // combatiente1 =  party1.chooseCharacter("1"); //comprobar si está vivo, si está devolver el character
        return party.getCharacterById(iDCharacter1);
    }

    /* printGraveYard imprime los Characters que hay en el cementerio*/
    public void printGraveYard () {
        System.out.println("💀 ░█▀▀█ ░█▀▀█ ░█▀▀█  ░█ █  ░█▀▀▀ ░█  ░█ ░█▀▀█ ░█▀▀█ ░█▀▀▄ 💀");
        System.out.println("💀 ░█─▄▄ ░█▄▄▀ ░█▄▄█  ░█ █  ░█▀▀▀ ░█▄▄▄█ ░█▄▄█ ░█▄▄▀ ░█ ░█ 💀");
        System.out.println("💀 ░█▄▄█ ░█ ░█ ░█ ░█   ▀▄▀  ░█▄▄▄   ░█   ░█ ░█ ░█ ░█ ░█▄▄▀ 💀\n");

        System.out.println("|ID - NAME");
        System.out.println("----------");
        for (Character character:graveYard) {
            System.out.println(character.getId() + "|" + character.getName());
        }
    }

//GETTERS & SETTERS
    public Party getParty1() {
        return party1;
    }

    public void setParty1(Party party1) {
        this.party1 = party1;
    }

    public Party getParty2() {
        return party2;
    }

    public void setParty2(Party party2) {
        this.party2 = party2;
    }

    public ArrayList<Character> getGraveYard() {
        return graveYard;
    }

    public void setGraveYard(ArrayList<Character> graveYard) {
        this.graveYard = graveYard;
    }

    public int getnumberOfDuel() {
        return numberOfDuel;
    }

    public void setnumberOfDuel(int numberOfDuel) {
        this.numberOfDuel = numberOfDuel;
    }
}
