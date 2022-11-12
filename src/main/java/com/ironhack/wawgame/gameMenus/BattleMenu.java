package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.*;
import com.ironhack.wawgame.gameObjects.Character;
import com.ironhack.wawgame.gameServices.Battle;

import java.util.ArrayList;
import java.util.Random;

public class BattleMenu {
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\u001B[0m";

    //Comienzo de la batalla
    public static void battleBegins () {
        Writer.printStringLineByLine("""
        ▒█▀▀█ █▀▀█░ ▀▀█▀▀ ▀▀█▀▀ █░  █▀▀   ▒█▀▀▄ █▀▀ █▀▀▀ ░▀░ █▀▀▄ █▀▀
        ▒█▀▀▄ █▄▄█░   █░    █░  █░  █▀▀   ▒█▀▀▄ █▀▀ █░▀█ ▀█▀ █░ █ ▀▀█
        ▒█▄▄█ █░ █░   █░    █░  █▄▄ █▄▄   ▒█▄▄█ █▄▄ █▄▄█ ▄█▄ █░ █ ▄▄█
        ⚔️️️️️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️⚔️
        
        """, 300);
    }

    //Tras acabar la batalla, preguntar si desea otra batalla
    public static void askIfStartNewBattle () {
        System.out.println("Do you want to start a new battle (Y/N)?");
    }


    //Imprimir los componentes de cada party para Battle
    public static void printCharactersAlive (String playerName, String partyName, ArrayList<Character> party) {
        System.out.println("\nPLAYER " + playerName +":");
        System.out.println("Choose your champion: "); //Elegirlo por iD
        System.out.println("PARTY " + partyName + " alive combatants");
        System.out.println("********************************");
        //Imprimir Wizards de la party
        System.out.println("\uD83E\uDDD9\u200D️ ᗯｴƵ\uD835\uDCD0ᏒƊS: ");
        for (Character character : party) {
            if (character instanceof Wizard) {
                System.out.println(((Wizard)character).toString());
            }
        }
        //Imprimir Warriors de la party
        System.out.println("⚔️ ᗯ\uD835\uDCD0ᎡᏒｴOᏒS: ");
        for (Character character : party) {
            if (character instanceof Warrior) {
                System.out.println(((Warrior)character).toString());
            }
        }

        //Imprimir Rogues de la party
        System.out.println("⚔️ R̷O̷G̷U̷E̷S̷: ");
        for (Character character : party) {
            if (character instanceof Rogue) {
                System.out.println(((Rogue)character).toString());
            }
        }

        //Imprimir The Chosen one de la party
        System.out.println("⚔️ T̶h̶e̶ c̶h̶o̶o̶s̶e̶n̶ o̶n̶e̶s̶: ");
        for (Character character : party) {
            if (character instanceof TheChosenOne) {
                System.out.println(((TheChosenOne)character).toString());
            }
        }
    }

    //Imprimir mensaje cuando el usuario no haya elegido bien el id del combatiente
    public static void printWrongIdSelected (){
        System.out.println("Character iD is not in the party, please choose other");

    }

    //Imprime los Characters que hay en el cementerio*/
    public static void printGraveYard (Battle battle) {
        Writer.printStringLineByLine("""
        \n
         💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀
        💀 ░█▀▀█ ░█▀▀█ ░█▀▀█  ░█ █  ░█▀▀▀ ░█  ░█ ░█▀▀█ ░█▀▀█ ░█▀▀▄ 💀
        💀 ░█─▄▄ ░█▄▄▀ ░█▄▄█  ░█ █  ░█▀▀▀ ░█▄▄▄█ ░█▄▄█ ░█▄▄▀ ░█ ░█ 💀
        💀 ░█▄▄█ ░█ ░█ ░█ ░█   ▀▄▀  ░█▄▄▄   ░█   ░█ ░█ ░█ ░█ ░█▄▄▀ 💀
         💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀💀
        \n
        """, 300);

        System.out.println("|ID - NAME");
        System.out.println("----------");
        for (Character character:battle.getGraveYard()) {
           Writer.printStringCharByCharHorizontally(character.getId() + "  |  " + character.getName() + getRandomGraveyardSentence() + "\n", Writer.LOG_SPEED);
        }
    }

    //Mensaje informando el combatant que va al graveyard
    public static void printCharactersGotoGraveyard (Character character1, Character character2) {
        Writer.printStringCharByCharHorizontally("Both combatants are dead, %s and %s go to the graveyard\n".formatted(character1.getName(), character2.getName()),Writer.LOG_SPEED);
    }
    public static void printCharacterGotoGraveyard (Character character1) {
        Writer.printStringCharByCharHorizontally("%s is dead and go to the graveyard\n".formatted(character1.getName()),Writer.LOG_SPEED);
    }

    //Mensaje informando cuando la batalla ha terminado
    public static void printBattleIsFinished () {
        Writer.printStringLineByLine("""
        -------------------------------------------------------------------------
        ░█▀▀█ ─█▀▀█ ▀▀█▀▀ ▀▀█▀▀ ░█─── ░█▀▀▀ █ ░█▀▀▀█ 　 ░█▀▀▀█ ░█──░█ ░█▀▀▀ ░█▀▀█
        ░█▀▀▄ ░█▄▄█ ─░█── ─░█── ░█─── ░█▀▀▀ ─ ─▀▀▀▄▄ 　 ░█──░█ ─░█░█─ ░█▀▀▀ ░█▄▄▀
        ░█▄▄█ ░█─░█ ─░█── ─░█── ░█▄▄█ ░█▄▄▄ ─ ░█▄▄▄█ 　 ░█▄▄▄█ ──▀▄▀─ ░█▄▄▄ ░█─░█
        -------------------------------------------------------------------------
        \n
        """,300);
    }

    public static String getRandomGraveyardSentence() {
        int r = new Random().nextInt(1,10);
        switch (r){
            case 1:
                return "....use to like pastrami";
            case 2:
                return "....use to dream with a little house in the mountains and a herd of goats";
            case 3:
                return "....liked to drink tea with his grandma";
            case 4:
                return "....liked things";
            default:
                return "...... otras cosas";
        }
    }
    public static void printBattleWinner (Battle battle) {
        System.out.print("\n\n🏆🏆🏆🏆🏆" + GREEN + "\n WINNER IS  ");
        String winner = battle.getBattleWinner();
        System.out.println(YELLOW + winner + RESET);
    }




}//class ends
