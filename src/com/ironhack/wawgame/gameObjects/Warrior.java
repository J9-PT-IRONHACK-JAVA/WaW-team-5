//Nuevo test GitHub pablo --> Develop

package com.ironhack.wawgame.gameObjects;

public class Warrior extends Character implements Attacker {
    // Atributes
    private int stamina;
    private int strength;
    private static int staminaDamageHeavyAttack = -5;
    private static int staminaDamageWeakAttack = 1;

    //constructor

    public Warrior(Integer id, String name, int hp, boolean isAlive) {
        super(id, name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;
    }

    @Override
    public boolean getIsAlive() {
        return super.getIsAlive();
    }


    // add setters checking max value
    // stamina: random between 10-50
    // strength: random between 1-10


    public int getStamina() {
        return stamina;
    }

    public void setStamina() {
        //determinar el valor random de la stamina
        int stamina=(int)(Math.random()*41+10);
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength() {
        int strength =(int)(Math.random()*10+1);
        this.strength = strength;
    }


    // add Warrior related methods implementing Attacker interface

    @Override
    public void doAttack() {
        if (this.stamina >= staminaDamageHeavyAttack) {
            this.stamina -=staminaDamageHeavyAttack;
        }
        else {
            this.stamina -= staminaDamageWeakAttack;
        }
    }

    @Override
    public void receiveAttack (){
        if (this.stamina > Math.abs (staminaDamageHeavyAttack) ) {
            this.hp = hpDamageHeavy;
        }
        else {
            this.hp = hpDamageWeak;
        }
    }
// en principi això no cal:

    //    public void updateStamina (int stamina, int typeOfAttack) {
//        if (typeOfAttack == 1) {
//            this.stamina+=staminaDamageHeavyAttack;
//        }
//        else {
//            this.stamina+=staminaDamageWeakAttack;
//        }
//
//    }
    //    public  static int getStaminaDamage (int typeOfAttack) {
//        if (typeOfAttack == 1) {
//            return staminaDamageHeavyAttack;
//        }
//        else {
//            return staminaDamageWeakAttack;
//        }
//    }


}
