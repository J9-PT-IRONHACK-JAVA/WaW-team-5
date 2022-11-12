package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameObjects.Attacker;

public class DuelMenu {


    public static void attackLog(Attacker attacker1, Attacker attacker2) {
        System.out.println("The "+attacker1+" and "+attacker2+" do their attacks.");
    }

    public static void isATie() {
        System.out.println("It's a tie");
    }

    public static void duelFinished(){
        System.out.println("The duel is finished");
    }

    public static void looserDuel (Character character){
        //queremos llamar al nombre del combatant que ha perdido
        System.out.println("The combatant "+character.toString()+" looses the duel.");
    }

    //utilizamos sólo el combatant looser, ¿cómo llamamos al combatant contrario? (al ganador)
    public static void winnerDuel(Character character){
        System.out.println("The combatant "+character.toString()+" wins the duel.");
    }

}
