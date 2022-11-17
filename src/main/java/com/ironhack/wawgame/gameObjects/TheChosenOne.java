package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.CharactersMenu;

public class TheChosenOne extends Character implements Attacker {
    private int strength;
    private boolean isTheChosenOne;

    public TheChosenOne(int id, String name) {
        super(id, name, CharacterType.NORMAL_HUMAN);
        setHp(CHOSEN_ONE_NORMAL_HP);
        setStrength(CHOSEN_ONE_NORMAL_STRENGTH);
        setTheChosenOne(false);
    }
    @Override
    public int doAttack() {
        return super.doAttack(strength);
    }
    @Override
    public void receiveAttack(int damage) {
        super.receiveDamage(damage);
        if (!isTheChosenOne && !getIsAlive()) {
            this.theAwakening();
        }
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    private void theAwakening() {
        if ((Math.random() * 100) >= 60) {
            CharactersMenu.printChosenOneAwakening(this.getName());
            CharactersMenu.printTheChosenOneAwakened();
            setHp(CHOSEN_ONE_AWAKENED_HP);
            setStrength(CHOSEN_ONE_AWAKENED_STRENGTH);
            setTheChosenOne(true);
            setIsAlive(true);
            setCharacterType(CharacterType.CHOSEN_ONE);
        } else {
            CharactersMenu.printOracleIsWrong(this.getName());
        }
    }

    public void setTheChosenOne(boolean theChosenOne) {
        isTheChosenOne = theChosenOne;
    }

    public int getStrength() {
        return strength;
    }

    public String isTheChosenOne() {
        if (isTheChosenOne) {
            return "yes, I am";
        }
        return "maybe";
    }

    public boolean getIsTheChosenOne() {
        return isTheChosenOne;
    }

    @Override
    public String toString() {
        String weapon = "empty";
        if (getWeapon() != null){
            weapon = getWeapon().toString();
        }
        String type = "Normal human";
        if (isTheChosenOne) {
            type = "The chosen one";
        }
        return "%s {Id=%s, Name=%s, Hp=%s, Strength=%s, IsTheChosenOne=%s, Weapon=%s}".formatted(type, getId(), getName(),getHp(), getStrength(), isTheChosenOne(), weapon);
    }
}
