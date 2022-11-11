package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.CharactersMenu;

import java.util.Random;

public class Rogue extends Character implements Attacker {
    // ATTRIBUTES
    private int agility;
    private int rage;
    private static final int rageNeededHeavyAttack = 6;
    private static final int rageWonWeakAttack = 1;

    // CONSTRUCTOR
    public Rogue(Integer id, String name) {
        super(id, name, CharacterType.ROGUE);
        setAgility();
        setRage();
    }

    @Override
    public int doAttack() {
        int damage;
        if (this.rage >= rageNeededHeavyAttack) {
            this.rage -= rageNeededHeavyAttack;
            damage = getAgility()*2;
        } else {
            this.rage += rageWonWeakAttack;
            damage = getAgility();
        }
        return super.doAttack(damage);
    }

    private boolean dodge() {
        Random rand = new Random();
        if (rand.nextInt(this.agility, 100) > 70 ) {
            CharactersMenu.printRogueDodge(this.getName());
            CharactersMenu.printRogue();
            return true;
        }
        return false;
    }
    @Override
    public void receiveAttack(int damage) {
        if (!dodge()) {
            super.receiveDamage(damage);
        }
    }

    public void setHp() {
        super.setHp(new Random().nextInt(ROGUE_MIN_HP, ROGUE_MAX_HP));
    }
    public int getAgility() {
        return agility;
    }

    private void setAgility() {
        this.agility = new Random().nextInt(ROGUE_MIN_AGILITY, ROGUE_MAX_AGILITY);;
    }

    private void setRage() {
        this.rage = new Random().nextInt(ROGUE_MIN_RAGE, ROGUE_MAX_RAGE);;
    }

    public int getRage() {
        return rage;
    }

    @Override
    public String toString() {
        return "Rogue {Id=%s, Name=%s, Hp=%s, Agility=%s, Rage=%s}".formatted(getId(), getName(), getHp(), getAgility(), getRage());
    }
}
