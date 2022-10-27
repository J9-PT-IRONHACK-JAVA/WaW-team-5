package com.ironhack.waw;

import com.ironhack.waw.gameServices.Game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        while (true) {
            String resp = game.askSomethingToUser("Do you want to play a game?");
            if (resp.equals("yes")) {
                // crear lista de characters 1;
                // crear lista de characters 2;
//
                // team1 = new team(lista de characters1);
                // team2 = new team(lista de characters2);
//
                // battle = new batle(team1, team2);
//
                // battle.initilizeGame();
//
                // while (!battle.isFinished()) {

                //     battle.NextRound();
                // }


            } else {
                break;
            }
        }
    }
}