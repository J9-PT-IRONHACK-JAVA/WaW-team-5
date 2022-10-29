package com.ironhack.wawgame.gameObjects;

public class Character {
    private Integer id;
    private String name;
    protected int hp;
    private boolean isAlive;

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

}
