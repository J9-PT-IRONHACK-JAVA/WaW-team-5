package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.CharactersMenu;

public class Warrior extends Character implements Attacker {
    // ATTRIBUTES
    private int stamina;
    private int strength;
    private static int staminaNeededHeavyAttack = 5;
    private static int staminaWonWeakAttack = 1;

    //CONSTRUCTOR
    public Warrior(int id, String name) {
        super(id, name);
        setStamina();
        setStrength();
    }

    // METHODS
    @Override
    public int doAttack() {
        CharactersMenu.printPreparingAttack("Warrior", this.getName());
        if (this.stamina >= staminaNeededHeavyAttack) {
            this.stamina -= staminaNeededHeavyAttack;
            return getStrength()*2;
        } else {
            this.stamina += staminaWonWeakAttack;
            return getStrength();
        }
    }
    @Override
    public void receiveAttack(int damage) {
        super.receiveDamage(damage);
    }

    // GETTERS & SETTERS
    @Override
    public void setHp() {
        super.setHp((int) (Math.random() * 101 + 100));
    }

    private void setStamina() {
        this.stamina = (int) (Math.random() * 41 + 10);
    }

    private void setStrength() {
        this.strength = (int) (Math.random() * 11 + 1);
    }

    public int getStrength() {
        return strength;
    }
}
