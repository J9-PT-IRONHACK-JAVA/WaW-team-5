package com.ironhack.wawgame;

import com.ironhack.wawgame.gameMenus.Writer;
import com.ironhack.wawgame.gameServices.Battle;
import com.ironhack.wawgame.gameServices.Game;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Writer.printStringCharByCharHorizontally(">======||==0");
        Writer.printFileLineByLine("src/TheChosenOneAwakened.txt");
        Game game = new Game();
        while (true) {
            String resp = game.askSomethingToUser("Do you want to play a game?");
            if (resp.equals("yes")) {
                var party1 = game.generatePartyFromCsv("src/party1.csv");
                var party2 = game.generatePartyFromCsv("src/party2.csv");

                var battle = new Battle(party1, party2);

                while (!battle.isFinished()) {
                    battle.nextDuel();
                    battle.printGraveYard();
                }
            } else {
                break;
            }
        }
    }
}