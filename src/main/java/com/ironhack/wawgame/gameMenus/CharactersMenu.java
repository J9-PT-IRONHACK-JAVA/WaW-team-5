package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Character;

public class CharactersMenu {

    // WARRIOR MENU
    public static void printWarrior() {
    }

    // WIZARD MENU
    public void printWizard() {

    }


    // THE CHOSEN ONE MENU
    public static void printTheChosenOneAwakened() {
        Writer.cleanConsole();
        try {
            Writer.printFileLineByLine("src/TheChosenOneAwakened.txt", 50);
        } catch (Exception e)  {
            System.out.println("can't print the chosen one, draw not found");
        }
    }

    public static void printChosenOneAwakening(String name) {
        Writer.cleanConsole();
        Writer.printStringCharByCharHorizontally("%s seems dead... but... What is this power feeling?\n".formatted(name), 50);
        Writer.printStringCharByCharHorizontally("Could be possible The oracle was right?...\n", 75);
        Writer.printStringCharByCharHorizontally("Is they...", 75);
        try{Thread.sleep(500);}catch (Exception e){}
        Writer.printStringCharByCharHorizontally("...the chosen one?\n", 75);
    }

    public static void printChosenOneAwakenedAttack(String name) {

    }

    public static void printOracleIsWrong(String name) {
        Writer.cleanConsole();
        Writer.printStringCharByCharHorizontally("%s is dead... the Oracle was wrong, he wasn't the chosen one\n".formatted(name), Writer.LOG_SPEED);
    }


    // ROGUE MENU

    public static void printRogueDodge(String name) {
        Writer.cleanConsole();
        Writer.printStringCharByCharHorizontally("%s is very quick, he dodged the attack of his opponent\n".formatted(name), Writer.LOG_SPEED);
    }


    public static void printRogue() {
        Writer.cleanConsole();
        try {
            Writer.printFileLineByLine("src/Rogue.txt", 50);
        } catch (Exception e)  {
            System.out.println("can't print rogue, draw not found");
        }
    }
}
