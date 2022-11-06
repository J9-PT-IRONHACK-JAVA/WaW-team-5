package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Character;
import com.ironhack.wawgame.gameObjects.Warrior;
import com.ironhack.wawgame.gameObjects.Wizard;

import java.util.ArrayList;

public class BattleMenu {

    //Comienzo de la batalla
    public  static void battleBegins () {
        System.out.println("▒█▀▀█ █▀▀█ ▀▀█▀▀ ▀▀█▀▀ █░░ █▀▀ 　 █▀▀▄ █▀▀ █▀▀▀ ░▀░ █▀▀▄ █▀▀");
        System.out.println("▒█▀▀▄ █▄▄█ ░░█░░ ░░█░░ █░░ █▀▀ 　 █▀▀▄ █▀▀ █░▀█ ▀█▀ █░░█ ▀▀█");
        System.out.println("▒█▄▄█ ▀░░▀ ░░▀░░ ░░▀░░ ▀▀▀ ▀▀▀ 　 ▀▀▀░ ▀▀▀ ▀▀▀▀ ▀▀▀ ▀░░▀ ▀▀▀");
        System.out.println("⚔️️️️️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️");
    }

    //Tras acabar la batalla, preguntar si desea otra batalla
    public static void askIfStartNewBattle () {
        System.out.println("Do you want to start a new battle (Y/N)?");
    }


    //Confirmación que las partys se han generado
    public static void partysGenerated () {
        System.out.println("Parties generated. Battle ready to start");
    }

    //Imprimir los componentes de cada party para Battle
    public static void printPartiesCharacters (int partyNumber, ArrayList<Character> party) {
        System.out.println("PARTY " + partyNumber + " combatants");
        System.out.println("********************************");
        System.out.println("\uD83E\uDDD9\u200D️ ᗯｴƵ\uD835\uDCD0ᏒƊS: ");
        for (Character character : party) {
            if (character instanceof Wizard) {
                System.out.println(character);
            }
        }
        System.out.println("⚔️ ᗯ\uD835\uDCD0ᎡᏒｴOᏒS: ");
        for (Character character : party) {
            if (character instanceof Warrior) {
                System.out.println(character);
            }
        }
    }

}
