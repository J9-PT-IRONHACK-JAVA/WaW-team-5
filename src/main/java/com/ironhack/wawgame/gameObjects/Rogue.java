package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.CharactersMenu;

import java.util.Random;

public class Rogue extends Character implements Attacker {
    // ATTRIBUTES
    private int agility;
    private int rage;
    private static final int rageNeededHeavyAttack = 6;
    private static final int rageWonWeakAttack = 1;

    // CONSTRUCTOR
    public Rogue(Integer id, String name, int agility, int rage) {
        super(id, name);
        setAgility();
        setRage();
    }

    @Override
    public int doAttack() {
        if (this.rage >= rageNeededHeavyAttack) {
            this.rage -= rageNeededHeavyAttack;
            return getAgility()*2;
        } else {
            this.rage += rageWonWeakAttack;
            return getAgility();
        }
    }

    private boolean dodge() {
        Random rand = new Random();
        if (rand.nextInt(this.agility, 100) > 70 ) {
            CharactersMenu.printRogueDodge(this.getName());
            return true;
        }
        return false;
    }
    @Override
    public void receiveAttack(int damage) {
        if (!dodge()) {
            super.receiveDamage(damage);
        }
    }

    public int getAgility() {
        return agility;
    }

    private void setAgility() {
        this.agility = (int) (Math.random() * 31 + 10);;
    }

    private void setRage() {
        this.rage = (int) (Math.random() * 21 + 10);;
    }
}
