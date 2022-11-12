package com.ironhack.wawgame;

import com.ironhack.wawgame.gameMenus.BattleMenu;
import com.ironhack.wawgame.gameServices.Battle;
import com.ironhack.wawgame.gameServices.Game;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        while (true) {
            String resp = game.askSomethingToUser("Do you want to play a game?");
            if (resp.equals("yes")) {
                var party1 = game.generatePartyFromCsv("src/party1.csv");
                var party2 = game.generatePartyFromCsv("src/party2.csv");

                var battle = new Battle(party1, party2);

                while (!battle.isFinished()) {
                    battle.nextDuel();
                    BattleMenu.printGraveYard(battle);
                }
            } else {
                break;
            }
        }
    }
}