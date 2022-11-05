//Nuevo test GitHub pablo --> Develop

package com.ironhack.wawgame.gameObjects;

public abstract class Character {
    private Integer id;
    private String name;
    protected int hp;
    private boolean isAlive;
    protected final int hpDamageHeavy = 3;
    protected final int hpDamageWeak  = 1;

    //Constructor

    public Character(Integer id, String name, int hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }


    public void receiveDamage (int damage){
        if (this.hp > damage) {
            this.hp -= damage;
        } else {
            this.isAlive = false;
        }
    }

    //GETTERS & SETTERS

    public int getHp () {
        return this.hp;
    }

    public boolean getIsAlive () {
        return this.isAlive;
    }

    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }
}
