package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Character;

public class CharactersMenu {

    // WARRIOR MENU
    public static void printWarrior() {
    }

    public static void printHeavyAttack(String name, int damage) {
        Writer.printStringCharByCharHorizontally("%s is full of stamina and make a heavy attack and deals %s points of damage to his opponent".formatted(name, damage),10);
        Writer.cleanConsole();

    }


    // WIZARD MENU
    public void printWizard() {

    }

    public static void printFireballAttack(String name, int damage) {
        Writer.printStringCharByCharHorizontally("%s is full of mana and make a fireball attack and deals %s points of damage to his opponent".formatted(name, damage),10);
        Writer.cleanConsole();
    }


    // THE CHOSEN ONE MENU
    public void printTheChosenOneAwakened() {
        try {
            Writer.printFileLineByLine("src/TheChosenOneAwakened", 50);
        } catch (Exception e)  {
            System.out.println("can't print the chosen one, draw not found");
        }
    }

    public static void printChosenOneAwakening(String name) {
        Writer.printStringCharByCharHorizontally("%s seems dead... but... What is this power feeling?\n".formatted(name), 50);
        Writer.printStringCharByCharHorizontally("Could be possible The oracle was right?...\n", 75);
        Writer.printStringCharByCharHorizontally("Is he...", 75);
        try{Thread.sleep(500);}catch (Exception e){}
        Writer.printStringCharByCharHorizontally("...the chosen one?\n", 75);
    }

    public static void printChosenOneAwakenedAttack(String name) {

    }

    public static void printOracleIsWrong(String name) {
        Writer.printStringCharByCharHorizontally("%s is dead,, the Oracle was wrong, he wasn't the chosen one\n".formatted(name), 50);
    }


    // ROGUE MENU

    public static void printRogueDodge(String name) {
        Writer.printStringCharByCharHorizontally("%s is very quick, he dodged the attack of his opponent\n".formatted(name), 50);
    }

}
