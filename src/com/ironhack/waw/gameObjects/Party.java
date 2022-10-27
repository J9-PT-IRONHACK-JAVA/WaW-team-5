package com.ironhack.waw.gameObjects;

import java.util.ArrayList;

public class Party {
    private ArrayList<Character> party;
    private int size;
    private final int MAX_SIZE_PARTY = 5;

    public Character chooseCharacter(String name) { // decide if choose character by id or by name
        // add logic for select character by name
        // check if exist
        return new Character(); // return character if found else return null
    }

    // Add addCharacter method, check if the party if full, increase size attribute by 1, add charracter to pary attribute
    // Add removeCharacter method (by name?, by ID) , check if character exist
    // add size method that return size attribute
}
