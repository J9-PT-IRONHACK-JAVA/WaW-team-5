package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Character;

public class CharactersMenu {

    // COMMON METHODS
    public static void printPreparingAttack(String characterType, String characterName) {
        System.out.println("%s %s prepares for attack!!".formatted(characterType, characterName));
    }

    public static void printEnoughEnergy(String energyType, String heavyAttack) {
        System.out.println("");
    }

    // WARRIOR MENU

    public static void printWarrior() {
    }

    public static void printWeakAttack() {
        System.out.println("");
    }

    // WIZARD MENU

    public void printWizard() {

    }
}
