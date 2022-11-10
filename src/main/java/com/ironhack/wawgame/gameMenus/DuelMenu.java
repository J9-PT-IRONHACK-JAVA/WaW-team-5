package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Attacker;
import com.ironhack.wawgame.gameObjects.Character;

public class DuelMenu {


    public static void attackLog(Attacker attacker1, Attacker attacker2) {
        var name1 = ((Character) attacker1).getName();
        var name2 = ((Character) attacker2).getName();
        System.out.println("The " + name1 + " and " + name2 + " do their attacks.");
        var wrappedName1 = Writer.addCharacterToBeginingAndEndOfString("=", name1, 25);
        var wrappedName2 = Writer.addCharacterToBeginingAndEndOfString("=", name2, 25);
        System.out.println(wrappedName1 + "     \uD83D\uDDE1️⚔     " + wrappedName2);
    }

    public static void isATie() {
        System.out.println("It's a tie");
    }

    public static void duelFinished() {
        System.out.println("The duel is finished");
    }

    public static void looserDuel(Character character) {
        //queremos llamar al nombre del combatant que ha perdido
        System.out.println("The combatant " + character.getName() + " looses the duel.");
    }

    //utilizamos sólo el combatant looser, ¿cómo llamamos al combatant contrario? (al ganador)
    public static void winnerDuel(Character character) {
        System.out.println("The combatant " + character.getName() + " wins the duel.");
    }

    public static void restingHp(Attacker attacker) {

    }
}