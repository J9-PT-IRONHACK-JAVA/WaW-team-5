//Nuevo test GitHub pablo --> Develop
package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.CharactersMenu;

import java.util.Random;

public class Wizard extends Character implements Attacker {
    // ATTRIBUTES
    private int intelligence;
    private int mana;
    private static int manaNeededFireball = 5;
    private static int manaWonStaffAttack = 1;

    // CONSTRUCTOR
    public Wizard(Integer id, String name) {
        super(id, name);
        setIntelligence();
        setMana();
    }

    // METHODS
    public int doAttack() {
        Random rand = new Random();
        if (rand.nextInt(this.mana, 100) > 95 ) {
            CharactersMenu.printWizardSuperAttack(this.getName());
            var damage = getIntelligence()*3;
            return damage;
        }
        if (this.mana >= manaNeededFireball) {
            this.mana -= manaNeededFireball;
            var damage = getIntelligence();
            return damage;
        } else {
            this.mana += manaWonStaffAttack;
            return 2;
        }
    }

    @Override
    public void receiveAttack(int damage) {
        super.receiveDamage(damage);
    }

    // GETTERS & SETTERS
    public int getIntelligence() {
        return intelligence;
    }

    private void setIntelligence() {
        this.intelligence = (int)(Math.random()*50+1);
    }

    private void setMana() {
        this.mana = (int)(Math.random()*41+10);
    }

    @Override
    public void setHp() {
        super.setHp((int) (Math.random() *  51 + 50));
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "Wizard {Id=%s, Name=%s, Hp=%s, Intelligence=%s, Mana=%s}".formatted( getId(), getName(),getHp(), getIntelligence(), getMana());
    }
}
