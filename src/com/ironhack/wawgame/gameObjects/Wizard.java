//Nuevo test GitHub pablo --> Develop
package com.ironhack.wawgame.gameObjects;

public class Wizard extends Character implements Attacker {
    private int intelligence;
    private int mana;

    private static int manaDamageHeavyAttack = 5;
    private static int manaDamageWeakAttack = 1;

    //Constructor
    public Wizard(Integer id, String name) {
        super(id, name);
        setIntelligence();
        setMana();
    }

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

    @Override
    public void setHp() {
        this.hp = (int) (Math.random() * 51 + 50);
    }

    public int doAttack() {
        if (this.mana >= manaDamageHeavyAttack) {
            this.mana -= manaDamageHeavyAttack;
            return manaDamageHeavyAttack;
        } else {
            this.mana -= manaDamageWeakAttack;
            return manaDamageWeakAttack;
        }
    }

    @Override
    public void receiveAttack(int damage) {
        super.receiveDamage(damage);
    }
}
