package com.ironhack.wawgame.gameObjects;

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

//Notas de LUIS
    // Add addCharacter method, check if the party if full, increase size attribute by 1, add charracter to pary attribute
    // Add removeCharacter method (by name?, by ID) , check if character exist
    // add size method that return size attribute



//Notas de Pablo para la clase Battle

    //crear un metodo para devolver true o false si el id está dentro de la party
    public boolean characterIsInParty (int id) {
        return true;
    }

    public  ArrayList <Character> getParty  (){
        return party;
    }

    //crear un metodo para devolver el character en función de su id
    public Character getCharacterById (int id) {
        return null;
    }

    //crear un metodo que elimine un Character de la party
    public void removeCharacterOfParty (Character character) {

    }

    //crear metodo toString cono los datos de cada Character de la party
    public String toString () {
        return "hola";
    }
}
