//Nuevo test GitHub pablo --> Develop

package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.CharactersMenu;
import com.ironhack.wawgame.gameMenus.Writer;

public abstract class Character {
    // ATTRIBUTES
    private Integer id;
    private String name;
    private int hp;
    private boolean isAlive;

    private Weapon weapon;

    private CharacterType type;

    public enum CharacterType {
        WIZARD, WARRIOR, ROGUE, NORMAL_HUMAN, CHOSEN_ONE, MONSTER
    }

    // WARRIOR STATS
    protected final int WARRIOR_MAX_HP = 250;
    protected final int WARRIOR_MIN_HP = 150;
    protected final int WARRIOR_MAX_STAMINA = 30;
    protected final int WARRIOR_MIN_STAMINA = 10;
    protected final int WARRIOR_MAX_STRENGTH = 30;
    protected final int WARRIOR_MIN_STRENGTH = 10;

    // WIZARD STATS
    protected final int WIZARD_MAX_HP = 120;
    protected final int WIZARD_MIN_HP = 70;
    protected final int WIZARD_MAX_INTELLIGENCE = 50;
    protected final int WIZARD_MIN_INTELLIGENCE = 25;
    protected final int WIZARD_MAX_MANA = 30;
    protected final int WIZARD_MIN_MANA = 15;

    // ROGUE STATS
    protected final int ROGUE_MAX_HP = 100;
    protected final int ROGUE_MIN_HP = 60;
    protected final int ROGUE_MAX_AGILITY = 35;
    protected final int ROGUE_MIN_AGILITY = 15;
    protected final int ROGUE_MAX_RAGE = 20;
    protected final int ROGUE_MIN_RAGE = 10;

    // CHOSEN ONE STATS
    protected final int CHOSEN_ONE_AWAKENED_HP = 350;
    protected final int CHOSEN_ONE_NORMAL_HP = 50;
    protected final int CHOSEN_ONE_AWAKENED_STRENGTH = 65;
    protected final int CHOSEN_ONE_NORMAL_STRENGTH = 2;

    // MONSTER STATS
    protected final int MONSTER_MAX_HP = 300;
    protected final int MONSTER_MIN_HP = 10;
    protected final int MONSTER_MAX_STRENGTH = 40;
    protected final int MONSTER_MIN_STRENGTH = 3;

    //CONSTRUCTOR
    public Character(Integer id, String name, CharacterType type) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.setHp();
        this.isAlive = true;
    }


    public int doAttack(int damage) {
        if (weapon != null) {
            return (int)((double)damage* weapon.getStatsMultiplayer());
        }
        return damage;
    }

    public void receiveDamage(int damage) {
        if (this.hp > damage) {
            this.hp -= damage;
        } else {
            this.hp = 0;
            this.isAlive = false;
        }
    }

    //GETTERS & SETTERS

    public void setCharacterType(CharacterType type) {
        this.type = type;
    }

    public CharacterType getCharacterType() {
       return type;
    }

    public void equipWeapon(Weapon weapon) {
        if (weapon.getWhoCanEquip().equals(CharacterType.NORMAL_HUMAN) || weapon.getWhoCanEquip().equals(this.type)) {
            this.weapon = weapon;
            CharactersMenu.printEquipedWeapon();
        } else {
            CharactersMenu.printNotAllowedWeapon();
        }
    }

    public int getHp() {
        return this.hp;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setHp() {}

    public Weapon getWeapon() {
        return weapon;
    }

    public String toString() {
        return "Character{" + "Id=" + getId() + ", Name=" + getName() + ", Hp=" + getHp() + "}";
    }
}
