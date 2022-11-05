//Nuevo test GitHub pablo --> Develop
package com.ironhack.wawgame.gameObjects;

public class Wizard extends Character implements Attacker {

    //Atributes HE CANVIAT TOT A INT PQ M SEMBLA MILLOR PERO POTSER NO
    private int intelligence;
    private int mana;

    private static int manaDamageHeavyAttack = 5;
    private static int manaDamageWeakAttack = 1;


    //Constructor
    public Wizard(Integer id, String name, int hp, boolean isAlive) {
        super(id, name, hp, isAlive);
        this.intelligence = intelligence;
        this.mana = mana;
    }


    // add Wizard related methods implementing Attacker interface
    // add constructor overriding Character class constructor
    // add getters
    // add setters checking max value
            // mana: random between 10-50
            // intelligence: random between 1-50


    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence() {
        int intelligence=(int)(Math.random()*50+1);
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana() {
        int mana=(int)(Math.random()*41+10);
        this.mana = mana;
    }

//      EN PPI AIXÒ NO CAL

//    public void updateMana(double mana, int typeOfAttack) {
//        if (typeOfAttack ==1) {
//            this.mana+=manaDamageHeavyAttack;
//        }
//        else {
//            this.mana+=manaDamageWeakAttack;
//        }    }
//
//    public  static int getManaDamage (int typeOfAttack) {
//        if (typeOfAttack == 1) {
//            return manaDamageHeavyAttack;
//        }
//        else {
//            return manaDamageWeakAttack;
//        }
//    }

    @Override
    public void doAttack() {
        if (this.mana >= manaDamageWeakAttack) {
            this.mana -=manaDamageWeakAttack;
        }
        else {
            this.mana -= manaDamageWeakAttack;
        }
    }

    @Override
    public void receiveAttack () {
        if (this.mana > Math.abs (manaDamageHeavyAttack)) {
            this.hp = hpDamageHeavy;
        }
        else {
            this.hp = hpDamageWeak;
        }
    }
}
