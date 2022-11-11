package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Attacker;
import com.ironhack.wawgame.gameObjects.Character;

public class DuelMenu {


    public static void attackLog(Attacker attacker1, Attacker attacker2) {
        var name1 = ((Character) attacker1).getName();
        var name2 = ((Character) attacker2).getName();
        System.out.println("The " + name1 + " and " + name2 + " do their attacks.");
        var wrappedName1 = Writer.addCharacterToBeginAndEndOfString("=", name1, 25);
        var wrappedName2 = Writer.addCharacterToBeginAndEndOfString("=", name2, 25);
        System.out.println(wrappedName1 + "     \uD83D\uDDE1️⚔     " + wrappedName2);
    }

    public static void isATie() {
        Writer.printStringCharByCharHorizontally("It's a tie! Both combatants fought bravery, but they left their lives in the battle arena... R.I.P.", Writer.LOG_SPEED);
    }

    public static void duelFinished(int counter) {
        System.out.println("\n");
        Writer.cleanConsole();
        Writer.printStringCharByCharHorizontally("Duel finish after %s attacks\n".formatted(counter), Writer.LOG_SPEED);
    }

    public static void resultOfTheDuel(Character winner, Character looser) {
        int lifeDiff = winner.getHp() - looser.getHp();
        if (lifeDiff > 100) {
            Writer.printStringCharByCharHorizontally("The power of %s is overwhelming, definitely %s has nothing to do\n".formatted(winner.getName(), looser.getName()), Writer.LOG_SPEED);
        } else if (lifeDiff > 30) {
            Writer.printStringCharByCharHorizontally("%s has a little advantage, %s fought bravery but finally loose\n".formatted(winner.getName(), looser.getName()), Writer.LOG_SPEED);
        } else {
            Writer.printStringCharByCharHorizontally("This duel was very tie, but %s gets ahead of his opponent at the last second\n".formatted(winner.getName(), looser.getName()), Writer.LOG_SPEED);
        }
    }
}