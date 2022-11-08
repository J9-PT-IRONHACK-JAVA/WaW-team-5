package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.CharactersMenu;

import java.util.Random;

public class TheChosenOne extends Character implements Attacker {
    private int strength;
    private boolean isTheChosenOne;

    public TheChosenOne(int id, String name) {
        super(id, name);
        setHp(30);
        setStrength(1);
        setTheChosenOne(false);
    }
    @Override
    public int doAttack() {
        CharactersMenu.printPreparingAttack("The chosen one", this.getName());
        if (!isTheChosenOne) {

        } else {

        }
        return strength;
    }
    @Override
    public void receiveAttack(int damage) {
        super.receiveDamage(damage);
        if (!isTheChosenOne && !getIsAlive()) {
            this.theAwakening();
        }
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    private void theAwakening() {
        if ((Math.random() * 100) >= 90) {
            setHp(350);
            setStrength(75);
            setTheChosenOne(true);
        } else {
            System.out.println("The oracle was wrong, he wasn't the chosen one");
        }
    }

    public void setTheChosenOne(boolean theChosenOne) {
        isTheChosenOne = theChosenOne;
    }
}
