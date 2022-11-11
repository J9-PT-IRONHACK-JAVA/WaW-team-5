package com.ironhack.wawgame.gameObjects;

public interface Attacker {


    public int doAttack();

    public void receiveAttack (int damage);

    public boolean getIsAlive ();
}
