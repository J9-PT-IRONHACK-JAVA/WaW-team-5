//Nuevo test GitHub pablo --> Develop

package com.ironhack.wawgame.gameObjects;

public abstract class Character {
    // ATTRIBUTES
    private Integer id;
    private String name;
    private int hp;
    private boolean isAlive;
    protected final int hpDamageHeavy = 3;
    protected final int hpDamageWeak = 1;

    //CONSTRUCTOR
    public Character(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.setHp();
        this.isAlive = true;
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
    public String toString() {
        return "Character{" + "Id=" + getId() + ", Name=" + getName() + ", Hp=" + getHp() + "}";
    }
}