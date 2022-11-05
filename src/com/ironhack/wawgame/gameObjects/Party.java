package com.ironhack.wawgame.gameObjects;

import java.util.ArrayList;

public class Party {
    private ArrayList<Character> party;
    private int size;
    private final int MAX_SIZE_PARTY = 5;

    public void addCharacter(Character character) {
        if (size < MAX_SIZE_PARTY) {
            party.add(character);
            size++;
        } else {
            System.out.println("The party is full");
        }
    }



    addCharacter
    chooseCharacter();
    RemoveCharacter
    // Add addCharacter method, check if the party if full, increase size attribute by 1, add character to party attribute
    // Add removeCharacter method (by name?, by ID) , check if character exist
    // add size method that return size attribute
}
    //public Character chooseCharacter(String name) {
    String string = " "
// decide if choose character by id or by name
// add logic for select character by name
// check if exist
        return new Character(); // return character if found else return null
                }