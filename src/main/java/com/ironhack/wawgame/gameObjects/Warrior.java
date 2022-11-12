package com.ironhack.wawgame.gameObjects;

public class Warrior extends Character implements Attacker {
    // Atributes
    private int stamina;
    private int strength;
    private static int staminaDamageHeavyAttack = -5;
    private static int staminaDamageWeakAttack = 1;

    //constructor
    public Warrior(int id, String name) {
        super(id, name);
        setStamina();
        setStrength();
    }

    public int getStamina() {
        return stamina;
    }

    @Override
    public void setHp() {
        this.hp = (int) (Math.random() * 101 + 100);
    }

    public void setStamina() {
        //determinar el valor random de la stamina
        int stamina = (int) (Math.random() * 41 + 10);
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength() {
        int strength = (int) (Math.random() * 10 + 1);
        this.strength = strength;
    }

    @Override
    public int doAttack() {
        if (this.stamina >= staminaDamageHeavyAttack) {
            this.stamina -= staminaDamageHeavyAttack;
            return staminaDamageHeavyAttack;
        } else {
            this.stamina -= staminaDamageWeakAttack;
            return staminaDamageWeakAttack;
        }
    }

    @Override
    public void receiveAttack(int damage) {
        super.receiveDamage(damage);
    }
}
