package com.ironhack.wawgame.gameServices;

import com.ironhack.wawgame.gameObjects.Party;

import java.util.Scanner;

public class Game {

    public Party generateRandomParty() {  // NO HACER POR AHORA
        return new Party();
    }

    public Party generatePartyFromCsv() {
        return new Party();
    }

    public Party generatePartyFromUserInput() { // NO HACER POR AHORA
        return new Party();
    }

    public String askSomethingToUser(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
