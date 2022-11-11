package com.ironhack.wawgame.gameObjects;

import java.util.Random;

public class Monster extends Character implements Attacker{
    private int strength;

    public Monster(Integer id, String name, CharacterType type) {
        super(id, name, type);
        setStrength();
    }


    public void setStrength() {
        this.strength = new Random().nextInt(MONSTER_MIN_STRENGTH, MONSTER_MAX_STRENGTH);
    }

    @Override
    public void setHp() {
        super.setHp(new Random().nextInt(MONSTER_MIN_HP, MONSTER_MAX_HP));
    }

    public int doAttack() {
        return super.doAttack(strength);
    }
    @Override
    public void receiveAttack(int damage) {
        super.receiveDamage(damage);
    }

    public Weapon dropWeapon() {
        double weaponRarityProb = (double)(this.strength + this.getHp())/(double) (MONSTER_MAX_STRENGTH + MONSTER_MAX_HP)* Math.random()*0.75;
        CharacterType type;
        String[] weaponNames = {
                "usksong",
                "SoulReaper",
                "Prudence",
                "Covergence",
                "Peacekeeper's Cane",
                "Grieving Baton",
                "Ruby Infused Scroll",
                "Stardust, Voice of the Oracle",
                "Moonbeam, Guardian of Dragonsouls",
                "Torment, Stone of Burdens"};
        int randNumber = new Random().nextInt(1,10);
        switch (randNumber) {
            case 1 -> type = CharacterType.ROGUE;
            case 2 -> type = CharacterType.WIZARD;
            case 3 -> type = CharacterType.WARRIOR;
            case 4 -> type = CharacterType.CHOSEN_ONE;
            default -> type = CharacterType.NORMAL_HUMAN;
        }
        if (weaponRarityProb >= 0.4) {
            return new Weapon(weaponNames[randNumber],Weapon.Rarity.LEGENDARY, type);
        } else if (weaponRarityProb >= 0.25) {
            return new Weapon(weaponNames[randNumber],Weapon.Rarity.EPIC, type);
        } else if (weaponRarityProb >= 0.1) {
            return new Weapon(weaponNames[randNumber],Weapon.Rarity.RARE, type);
        } else {
            return new Weapon(weaponNames[randNumber],Weapon.Rarity.COMMON, type);
        }
    }

    @Override
    public String toString() {
        return "Monster {Id=%s, Name=%s, Hp=%s, Strength=%s}".formatted( getId(), getName(),getHp(), getStrength());
    }

    public int getStrength() {
        return strength;
    }
}
