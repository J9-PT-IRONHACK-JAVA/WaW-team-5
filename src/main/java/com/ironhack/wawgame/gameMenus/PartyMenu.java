package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.*;
import com.ironhack.wawgame.gameObjects.Character;

import java.util.ArrayList;

public class PartyMenu {
    public static void printParty (String playerName, String partyName, ArrayList<Character> party) {
        System.out.println("\nPLAYER " + playerName +":");
        System.out.println("Choose your champion: "); //Elegirlo por iD
        System.out.println("PARTY " + partyName + " alive combatants");
        System.out.println("********************************");
        //Imprimir Wizards de la party
        System.out.println("\uD83E\uDDD9\u200D️ ᗯｴƵ\uD835\uDCD0ᏒƊS: ");
        for (Character character : party) {
            if (character.getCharacterType().equals(Character.CharacterType.WIZARD) ) {
                System.out.println(((Wizard)character).toString());
            }
        }
        //Imprimir Warriors de la party
        System.out.println("⚔️ ᗯ\uD835\uDCD0ᎡᏒｴOᏒS: ");
        for (Character character : party) {
            if (character.getCharacterType().equals(Character.CharacterType.WARRIOR)) {
                System.out.println(((Warrior)character).toString());
            }
        }

        //Imprimir Rogues de la party
        System.out.println("⚔️ R̷O̷G̷U̷E̷S̷: ");
        for (Character character : party) {
            if (character.getCharacterType().equals(Character.CharacterType.ROGUE)) {
                System.out.println(((Rogue)character).toString());
            }
        }

        //Imprimir Normal humans de la party
        System.out.println("⚔️ Normal humans: ");
        for (Character character : party) {
            if (character.getCharacterType().equals(Character.CharacterType.NORMAL_HUMAN)) {
                System.out.println(((TheChosenOne)character).toString());
            }
        }

        //Imprimir The Chosen one de la party
        System.out.println("⚔️ T̶h̶e̶ c̶h̶o̶o̶s̶e̶n̶ o̶n̶e̶s̶: ");
        for (Character character : party) {
            if (character.getCharacterType().equals(Character.CharacterType.CHOSEN_ONE)) {
                System.out.println(((TheChosenOne)character).toString());
            }
        }
    }
}
