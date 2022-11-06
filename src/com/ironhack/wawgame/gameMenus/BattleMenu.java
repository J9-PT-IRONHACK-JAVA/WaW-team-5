package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Character;
import com.ironhack.wawgame.gameObjects.Warrior;
import com.ironhack.wawgame.gameObjects.Wizard;
import com.ironhack.wawgame.gameServices.Battle;

import java.util.ArrayList;

public class BattleMenu {

    //Comienzo de la batalla
    public static void battleBegins () {
        System.out.println("▒█▀▀█ █▀▀█ ▀▀█▀▀ ▀▀█▀▀ █░░ █▀▀ 　 █▀▀▄ █▀▀ █▀▀▀ ░▀░ █▀▀▄ █▀▀");
        System.out.println("▒█▀▀▄ █▄▄█ ░░█░░ ░░█░░ █░░ █▀▀ 　 █▀▀▄ █▀▀ █░▀█ ▀█▀ █░░█ ▀▀█");
        System.out.println("▒█▄▄█ ▀░░▀ ░░▀░░ ░░▀░░ ▀▀▀ ▀▀▀ 　 ▀▀▀░ ▀▀▀ ▀▀▀▀ ▀▀▀ ▀░░▀ ▀▀▀");
        System.out.println("⚔️️️️️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️");
    }

    //Tras acabar la batalla, preguntar si desea otra batalla
    public static void askIfStartNewBattle () {
        System.out.println("Do you want to start a new battle (Y/N)?");
    }


    //Imprimir los componentes de cada party para Battle
    public static void printCharactersAlive (int playerNumber, ArrayList<Character> party) {
        System.out.println("\nPLAYER " + playerNumber +":");
        System.out.println("Choose id of Warrior or Wizard to duel: "); //Elegirlo por iD
        System.out.println("PARTY " + playerNumber + " alive combatants");
        System.out.println("********************************");
        //Imprimir Wizards de la party
        System.out.println("\uD83E\uDDD9\u200D️ ᗯｴƵ\uD835\uDCD0ᏒƊS: ");
        for (Character character : party) {
            if (character instanceof Wizard) {
                System.out.println(character);
            }
        }
        //Imprimir Warriors de la party
        System.out.println("⚔️ ᗯ\uD835\uDCD0ᎡᏒｴOᏒS: ");
        for (Character character : party) {
            if (character instanceof Warrior) {
                System.out.println(character);
            }
        }
    }

    //Imprimir mensaje cuando el usuario no haya elegido bien el id del combatiente
    public static void printWrongIdSelected (){
        System.out.println("Character iD is not in the party, please choose other");

    }

    /* printGraveYard imprime los Characters que hay en el cementerio*/
    public static void printGraveYard (Battle battle) {
        System.out.println("💀 ░█▀▀█ ░█▀▀█ ░█▀▀█  ░█ █  ░█▀▀▀ ░█  ░█ ░█▀▀█ ░█▀▀█ ░█▀▀▄ 💀");
        System.out.println("💀 ░█─▄▄ ░█▄▄▀ ░█▄▄█  ░█ █  ░█▀▀▀ ░█▄▄▄█ ░█▄▄█ ░█▄▄▀ ░█ ░█ 💀");
        System.out.println("💀 ░█▄▄█ ░█ ░█ ░█ ░█   ▀▄▀  ░█▄▄▄   ░█   ░█ ░█ ░█ ░█ ░█▄▄▀ 💀\n");

        System.out.println("|ID - NAME");
        System.out.println("----------");
        for (Character character:battle.getGraveYard()) {
            System.out.println(character.getId() + "|" + character.getName());
        }
    }


}//class ends
