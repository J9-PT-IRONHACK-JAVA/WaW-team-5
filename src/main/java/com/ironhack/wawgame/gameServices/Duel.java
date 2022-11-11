package com.ironhack.wawgame.gameServices;


import com.ironhack.wawgame.gameMenus.DuelMenu;
import com.ironhack.wawgame.gameMenus.Writer;
import com.ironhack.wawgame.gameObjects.Attacker;
import com.ironhack.wawgame.gameObjects.Character;


public class Duel {

    //ATRIBUTES
    private Character combatant1;
    private int hpCombatant1;
    private Character combatant2;
    private int hpCombatant2;
    private boolean isTie = false;

//CONSTRUCTOR

    public Duel(Character combatant1, Character combatant2) {
        this.combatant1 = combatant1;
        this.combatant2 = combatant2;
        this.hpCombatant1 = combatant1.getHp();
        this.hpCombatant2 = combatant2.getHp();
    }


    //METODOS
    public void fight(Attacker attacker1, Attacker attacker2) {
        //los atacantes atacan y sale por pantalla
        DuelMenu.attackLog(attacker1, attacker2);
        int counter = 0;
        while (attacker1.getIsAlive() && attacker2.getIsAlive()) {
            counter++;
            Writer.printLifeBars(this.hpCombatant1,((Character) attacker1).getHp(), this.hpCombatant2,((Character) attacker2).getHp());
            try{Thread.sleep(400);}catch (Exception e){}
            attack(attacker1, attacker2);

            Writer.cleanConsole();
            if (combatant1.getHp() <= 0 && combatant2.getHp() <= 0) {
                this.isTie = true;
                DuelMenu.isATie();
            }

        }
        Writer.printLifeBars(this.hpCombatant1,((Character) attacker1).getHp(), this.hpCombatant2,((Character) attacker2).getHp());
        DuelMenu.duelFinished(counter);
    }

    public Character getLooser(Character combatant1, Character combatant2) {
        if (!combatant1.getIsAlive()) {
            DuelMenu.resultOfTheDuel(combatant2, combatant1);
            return combatant1;
        } else {
            DuelMenu.resultOfTheDuel(combatant1, combatant2);
            return combatant2;
        }
    }

    //getWinner devuelve en tipo Character el ganador del duelo
    //@param combatant 1: combatiente 1 de la clase Duel
    //@param combatant 1: combatiente 2 de la clase Duel
    public Character getWinner(Character combatant1, Character combatant2) {
        if (combatant1.getHp() <= 0) {
            return combatant2;
        } else {
            return combatant1;
        }
    }

    //attack determina el tipo de ataque que realiza el atacante (attacker) y en función de ello,
    //resta el damage (setDamage) al attacker y resta hp al defender
    //@param attacker: es el Character que realiza el ataque
    //@param defender: es el Character que recibe el ataque
    //@param typeOfAttack: tipo de ataque que realiza attacker: 1=Heavy, 2=Weak
    public void attack(Attacker attacker1, Attacker attacker2) {
        var damageAttacker1 = attacker1.doAttack();
        attacker2.receiveAttack(damageAttacker1);

        var damageAttacker2 = attacker2.doAttack();
        attacker1.receiveAttack(damageAttacker2);

    }

//GETTERS & SETTERS


    public Character getCombatant1() {
        return combatant1;
    }

    public void setCombatant1(Character combatant1) {
        this.combatant1 = combatant1;
    }

    public Character getCombatant2() {
        return combatant2;
    }

    public void setCombatant2(Character combatant2) {
        this.combatant2 = combatant2;
    }

    public boolean isTie() {
        return isTie;
    }

    public void setTie(boolean tie) {
        isTie = tie;
    }
}
