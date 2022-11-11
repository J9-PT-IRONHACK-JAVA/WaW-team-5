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
        super(id, name, CharacterType.WARRIOR);
        setStamina();
        setStrength();
    }

    // METHODS
    @Override
    public int doAttack() {
        int damage;
        Random rand = new Random();
        if (rand.nextInt(this.stamina, 100) > 95 ) {
            CharactersMenu.printWarriorSuperAttack(this.getName());
            damage = getStrength()*10;
        }
        else if (this.stamina >= staminaNeededHeavyAttack) {
            this.stamina -= staminaNeededHeavyAttack;
            damage = getStrength()*2;
        } else {
            this.stamina += staminaWonWeakAttack;
            damage = getStrength();
        }
        return super.doAttack(damage);
    }
    @Override
    public void receiveAttack(int damage) {
        super.receiveDamage(damage);
    }

    // GETTERS & SETTERS
    @Override
    public void setHp() {
        super.setHp(new Random().nextInt(WARRIOR_MIN_HP, WARRIOR_MAX_HP));
    }

    private void setStamina() {
        this.stamina = new Random().nextInt(WARRIOR_MIN_STAMINA, WARRIOR_MAX_STAMINA);
    }

    private void setStrength() {
        this.strength = new Random().nextInt(WARRIOR_MIN_STRENGTH, WARRIOR_MAX_STRENGTH);
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    @Override
    public String toString() {
        String weapon = "empty";
        if (getWeapon() != null){
            weapon = getWeapon().toString();
        }
        return "Warrior {Id=%s, Name=%s, Hp=%s, Strength=%s, Stamina=%s, Weapon=%s}".formatted( getId(), getName(),getHp(), getStrength(), getStamina(), weapon);
    }
}
