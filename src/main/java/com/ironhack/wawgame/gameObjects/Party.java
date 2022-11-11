package com.ironhack.wawgame.gameObjects;

import com.ironhack.wawgame.gameMenus.BattleMenu;
import com.ironhack.wawgame.gameMenus.PartyMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Party {
    private String playerName;
    private String partyName;
    private ArrayList<Character> party;
    private int size;
    private final int MAX_SIZE_PARTY = 5;

    public Party() {
        party = new ArrayList<Character>();
        size = 0;
    }

    public void addCharacter(Character character) {
        if (size < MAX_SIZE_PARTY) {
            party.add(character);
            size++;
        } else {
            System.out.println("The party is full");
        }
    }

    public boolean characterIsInParty(int id) {
        for(Character character: this.party) {
            if (character.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public Character pickCombatant() {
        var scanner = new Scanner(System.in);

        PartyMenu.printParty(this.getPlayerName(), this.getPartyName(), this.party);
        int iDCharacter1 = scanner.nextInt();

        while (!this.characterIsInParty(iDCharacter1)) {
            BattleMenu.printWrongIdSelected();
            iDCharacter1 = scanner.nextInt();
        }
        // combatiente1 =  party1.chooseCharacter("1"); //comprobar si está vivo, si está devolver el character
        return this.getCharacterById(iDCharacter1);
    }

    public ArrayList<Character> getParty() {
        return party;
    }

    //crear un metodo para devolver el character en función de su id
    public Character getCharacterById(int id) {
        for(Character character: this.party) {
            if (character.getId() == id) {
                return character;
            }
        }
        System.out.println("character not found");
        return null;
    }

    //crear un metodo que elimine un Character de la party
    public void removeCharacterOfParty(Character character) {
        for(int i = 0; i < this.party.size(); i++) {
            if (this.party.get(i).getId() == character.getId()) {
                party.remove(i);
                break;
            }
        }
    }

    //crear metodo toString cono los datos de cada Character de la party
    public String toString() {
        String outputParty = "";
        for (Character character: party) {
            outputParty = outputParty + "Character{" +
                    "Id=" + character.getId() +
                    ", Name=" + character.getName() +
                    ", Hp=" + character.getHp() +
                    "}\n";
        }
        return outputParty;
    }

}


//public Character chooseCharacter(String name) {
// String string = " "
// decide if choose character by id or by name
// add logic for select character by name
// check if exist
// return new Character(); // return character if found else return null
// addCharacter
// chooseCharacter();
//     RemoveCharacter
// Add addCharacter method, check if the party if full, increase size attribute by 1, add character to party attribute

// Add removeCharacter method (by name?, by ID) , check if character exist
// add size method that return size attribute
