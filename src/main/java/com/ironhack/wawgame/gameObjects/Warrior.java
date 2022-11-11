package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.CharactersMenu;

import java.util.Random;

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
        Random rand = new Random();
        if (rand.nextInt(this.stamina, 100) > 95 ) {
            CharactersMenu.printWarriorSuperAttack(this.getName());
            var damage = getStrength()*10;
            return damage;
        }
        if (this.stamina >= staminaNeededHeavyAttack) {
            this.stamina -= staminaNeededHeavyAttack;
            var damage = getStrength()*2;
            return damage;
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

    public int getStamina() {
        return stamina;
    }

    @Override
    public String toString() {
        return "Warrior {Id=%s, Name=%s, Hp=%s, Strength=%s, Stamina=%s}".formatted( getId(), getName(),getHp(), getStrength(), getStamina());
    }
}
