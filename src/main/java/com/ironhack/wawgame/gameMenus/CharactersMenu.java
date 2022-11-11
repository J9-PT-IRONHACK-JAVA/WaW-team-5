package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Character;

public class CharactersMenu {

    // WEAPON MENU
    public static void printNotAllowedWeapon() {
        Writer.printStringCharByCharHorizontally("Unfortunately this weapon have not been made for you and you can't touch it...\n", Writer.LOG_SPEED);
    }

    public static void printEquipedWeapon() {
        Writer.printStringCharByCharHorizontally("Nice!! I can feel the power!!\n", Writer.LOG_SPEED);
    }
    // WARRIOR MENU
    public static void printWarrior() {
    }

    public static void printWarriorSuperAttack(String name) {
        Writer.cleanConsole();
        Writer.printStringLineByLine("",10);
        Writer.printStringCharByCharHorizontally("%s is very angry and attack his opponent with his own hands doing a lot of damage\n".formatted(name), Writer.LOG_SPEED);
    }

    // WIZARD MENU
    public void printWizard() {

    }

    public static void printWizardSuperAttack(String name) {
        Writer.cleanConsole();
        Writer.printStringLineByLine("",10);
        Writer.printStringCharByCharHorizontally("%s get the energy from the nature and prepare an energy thunderbolt attack\n".formatted(name), Writer.LOG_SPEED);
    }


    // THE CHOSEN ONE MENU
    public static void printTheChosenOneAwakened() {
        Writer.cleanConsole();
        try {
            Writer.printFileLineByLine("src/TheChosenOneAwakened.txt", 50);
        } catch (Exception e)  {
           Writer.printStringLineByLine(theChosenOne,100);
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
            Writer.printStringLineByLine(rogue, 50);
        }
    }


    private static final String rogue = """
                        
                        _____
                       /     \\--------------
                      //\\__   \\---   ---
                     {{____}   }_-------   ---
                    /            \\___----------   --
                   {           __    \\_____,---------------  --
                    '-,__,___,' \\'--,___---'--------------
                    || }        \\\\--------------
                    ||{_        {\\\\--------  ---
                  {\\'|/ '--,___-' \\\\--------------
                  /\\\\}          |======--------------
                 / /\\}   __     | | |---
                / / /   /  \\_   { | |------------  ---
               /_/ {   /     \\   }| |-----
                    \\ {       {  || /--------------
                     } \\       | ||/-----
                    '___'      | |--------------
                              /__|---
                        
                        
            """;

    private static final String theChosenOne = """
            
                                               __________
                                        -----              -----
                                   ---                            ---
                               --                                      --
                          --                    ________                     --
                        -                      /\\       \\\\                      -
                      -                       / /\\       \\\\                       -
                     -          .            / /  \\      _\\\\                       -
                    -           .        ___ \\ \\___}      \\_____                    -
                   ·           ' º      ( ______ ___ __________))                    ·
                  ·            º O      /|      .`T´.   \\     \\\\\\                      ·
                              O º '    / |    .'     '. /\\    {\\\\\\
                 .            {{{{    /   \\ ,'         {\\/\\    \\ \\\\                     .
                              \\   \\__/   / \\___________|/  }    } }}
                .               \\_/·___ /  {____(_)____}  /     \\{{                      .
                                          /             | \\_____///
                                         / /            | /   }  }}
                .                       /           \\   | @__/  {{                       .
                                       {             \\__|        {{
                                       {  /     \\     /          //
                .                       \\  '     \\   /   /      //                       .
                                         \\  /\\    \\ /   {       \\\\
                                          {/| \\    '    /       //
                 .                          !' \\  /|   /  /    //                       .
                                            '--|\\/ |     /    {{
                  .                            |___|\\   {    //                       .
                   .                           !, ,! }   /  //                       .
                    .                          |   |{   /\\ //                       .
                      -                        '---' \\ //                         -
                        -                            {//                        -
                          --                                                 --
                               --                                       --
                                   ---                            ---
                                        -----              -----
                                               ----------
            """;



}
