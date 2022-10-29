package com.ironhack.wawgame.gameObjects;

public class Warrior extends Character implements Attacker {
    // Atributes
    private int stamina;
    private double strength;
    private static int staminaDamageHeavyAttack = -5;
    private static int staminaDamageWeakAttack = 1;

    //Constructor
    public Warrior(Integer id, String name, int hp, boolean isAlive, boolean isWarrior, boolean isWizard, int stamina, double strength) {
        super(id, name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;
    }

    // add Warrior related methods implementing Attacker interface
    // add setters checking max value
            // stamina: random between 10-50
            // strength: random between 1-10

    public void updateStamina (int stamina, int typeOfAttack) {
        if (typeOfAttack == 1) {
            this.stamina+=staminaDamageHeavyAttack;
        }
        else {
            this.stamina+=staminaDamageWeakAttack;
        }

    }
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public boolean canHeavyAttack () {
        if (this.stamina >= staminaDamageHeavyAttack) {
            return true;
        } else {
            return false;
        }
    }
    public  static int getStaminaDamage (int typeOfAttack) {
        if (typeOfAttack == 1) {
            return staminaDamageHeavyAttack;
        }
        else {
            return staminaDamageWeakAttack;
        }
    }


}
