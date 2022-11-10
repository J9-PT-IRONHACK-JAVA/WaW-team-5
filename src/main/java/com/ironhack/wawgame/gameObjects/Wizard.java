//Nuevo test GitHub pablo --> Develop
package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.CharactersMenu;

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


}
