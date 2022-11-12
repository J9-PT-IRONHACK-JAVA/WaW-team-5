package com.ironhack.wawgame.gameObjects;

//atacante
public interface Attacker {

//atacante hace un ataque
    public int doAttack();
//recibe ataque con daño
    public void receiveAttack (int damage);
//poder saber si está vivo o no
    public boolean getIsAlive ();
}
