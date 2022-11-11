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
        super(id, name, CharacterType.WIZARD);
        setIntelligence();
        setMana();
    }

    // METHODS
    public int doAttack() {
        int damage;
        Random rand = new Random();
        if (rand.nextInt(this.mana, 100) > 95 ) {
            CharactersMenu.printWizardSuperAttack(this.getName());
            damage = getIntelligence()*3;
        }
        if (this.mana >= manaNeededFireball) {
            this.mana -= manaNeededFireball;
            damage = getIntelligence();
        } else {
            this.mana += manaWonStaffAttack;
            damage = 2;
        }
        return super.doAttack(damage);
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
        this.intelligence = new Random().nextInt(WIZARD_MIN_INTELLIGENCE, WIZARD_MAX_INTELLIGENCE);
    }

    private void setMana() {
        this.mana = new Random().nextInt(WIZARD_MIN_MANA, WIZARD_MAX_MANA);
    }

    @Override
    public void setHp() {
        super.setHp(new Random().nextInt(WIZARD_MIN_HP, WIZARD_MAX_HP));
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "Wizard {Id=%s, Name=%s, Hp=%s, Intelligence=%s, Mana=%s}".formatted( getId(), getName(),getHp(), getIntelligence(), getMana());
    }
}
