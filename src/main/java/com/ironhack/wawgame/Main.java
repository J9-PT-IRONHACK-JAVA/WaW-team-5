package com.ironhack.wawgame;

import com.ironhack.wawgame.gameMenus.BattleMenu;
import com.ironhack.wawgame.gameMenus.MainMenu;
import com.ironhack.wawgame.gameObjects.Party;
import com.ironhack.wawgame.gameServices.Battle;
import com.ironhack.wawgame.gameServices.Game;

import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        while (true) {
            String resp = game.askSomethingToUser("Do you want to play a game?");
            if (resp.equals("yes")) {
                String userOption = MainMenu.printOptionsMenuAndGetOptionFromUser(game);
                Party party1,party2;
                if (userOption.equals("1")) {
                   String optionPlayer1 = MainMenu.printCsvOptionAndGetPathFromUser(game,1);
                   party1 = game.generatePartyFromCsv(optionPlayer1);//src/main/java/party1.csv
                   String optionPlayer2 = MainMenu.printCsvOptionAndGetPathFromUser(game,2);
                   party2 = game.generatePartyFromCsv(optionPlayer2);//"src/main/java/party2.csv"
                } else if (userOption.equals("2")) {
                    party1 = game.generateRandomParty();
                    party2 = game.generateRandomParty();
                } else {
                    break;
                }

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