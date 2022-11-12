package com.ironhack.wawgame.gameObjects;

//clase character con un id, name, hp. Con un booleano para saber si está vivo y un ataque fuerte o débil.
public abstract class Character {
    private Integer id;
    private String name;
    protected int hp;
    private boolean isAlive;
    protected final int hpDamageHeavy = 3;
    protected final int hpDamageWeak  = 1;

    //Constructor

    public Character(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.setHp();
        this.isAlive = true;
    }

//recibe daño
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

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void setHp();
}
