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
    public Character(Integer id, String name, int hp, boolean isAlive, boolean isWarrior, boolean isWizard) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    // add loseHP method
    // add getters, setters
    // decide if add isAlive method or is enough with getIsAlive (getter) method


    public void looseHp (int hp){
        this.hp-=hp;
    }

    //GETTERS & SETTERS

    public int getHp () {
        return this.hp;
    }

    public boolean getIsAlive () {
        return this.isAlive;
    }
}
