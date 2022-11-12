package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Monster;
import com.ironhack.wawgame.gameObjects.Weapon;

public class ExpeditionMenu {
    public static String showMonsterPowerAndAskToScape(Monster monster) {
        if (monster.getHp() > 200) {
            Writer.printStringCharByCharHorizontally("A monster appear!!! Looks really strong, do you want to fight them?\n",Writer.LOG_SPEED);
        } else {
            Writer.printStringCharByCharHorizontally("A monster appear!!! Do you want to fight them?\n",Writer.LOG_SPEED);
        }
        System.out.println(monster.toString());
        return Writer.askSomethingToUser("(Type yes or no)");
    }

    public static String printMonsterDieAndDropEquip(Weapon weapon) {
        Writer.printStringCharByCharHorizontally("WoooW, the monster dropped a weapon!!\n", Writer.LOG_SPEED);
        var colorWeapon = "";
        switch (weapon.getRarity()){
            case LEGENDARY -> colorWeapon = "\u001B[33m";
            case EPIC -> colorWeapon = "\u001B[36m";
            case RARE -> colorWeapon = "\u001B[34m";
            default -> colorWeapon = "\u001B[32m";
        }
        System.out.println(colorWeapon+weapon.toString());
        Writer.cleanConsole();
        return Writer.askSomethingToUser("Do you want to equip this weapon? \n (type yes or no)");
    }

    public static void printScape() {
        Writer.printStringCharByCharHorizontally("After observe the monster you decide to scape from them....                        coward!\n", Writer.LOG_SPEED );
    }

    public static void printScapeAfterLose() {
        Writer.printStringCharByCharHorizontally("The monster was very strong and you have to scape....                        coward!\n", Writer.LOG_SPEED );
    }
    public static void printNotAllowedExpeditions() {
        Writer.printStringCharByCharHorizontally("Your champions are tired and you can't continue..",Writer.LOG_SPEED);
    }

    public static String askForAnotherExpedition() {
        return Writer.askSomethingToUser("Do you want to make another expedition? (type yes or no)");
    }


}

