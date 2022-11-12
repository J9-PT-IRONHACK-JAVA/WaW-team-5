package com.ironhack.wawgame;

import com.ironhack.wawgame.gameMenus.BattleMenu;
import com.ironhack.wawgame.gameMenus.MainMenu;
import com.ironhack.wawgame.gameObjects.Party;
import com.ironhack.wawgame.gameServices.Battle;
import com.ironhack.wawgame.gameServices.Expedition;
import com.ironhack.wawgame.gameServices.Game;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MainMenu.welcomeMessage();

        //Se genera una nueva partida
        Game game = new Game();

        boolean firsTime = true;
        while (true) {
            String resp;
            if (firsTime) {
                resp = MainMenu.askForGameAndGetResponseFromUser();
            } else {
                resp = MainMenu.askForAnotherGameAndGetResponseFromUser();
            }

            //si la respuesta es yes, empieza el juego y se generan los equipos
            if (resp.equals("yes")) {

                //Pedimos al usuario que escoja entre 2 opciones. Vamos al MainMenu donde se printan las opciones
                String userOption = MainMenu.printOptionsMenuAndGetOptionFromUser();
                Party party1, party2; //se generan los dos jugadores y parties (nombre)
                var player1Name = MainMenu.askUserForHisName(1);
                var party1Name = MainMenu.askUserForTeamName();
                var player2Name = MainMenu.askUserForHisName( 2);
                var party2Name = MainMenu.askUserForTeamName();
                if (userOption.equals("1")) { // preguntamos como generar la party (random o scv)
                    //si es CSV, el usuario tiene que ingresar el path del csv
                    String optionPlayer1 = MainMenu.printCsvOptionAndGetPathFromUser(party1Name);
                    party1 = game.generatePartyFromCsv(optionPlayer1);//src/main/java/party1.csv
                    String optionPlayer2 = MainMenu.printCsvOptionAndGetPathFromUser(party2Name);
                    party2 = game.generatePartyFromCsv(optionPlayer2);//"src/main/java/party2.csv"
                } else if (userOption.equals("2")) {
                    party1 = game.generateRandomParty();
                    party2 = game.generateRandomParty();
                } else { //si no escoge entre estas dos opciones, se sale del juego
                    break;
                }
                party1.setPlayerName(player1Name);
                party1.setPartyName(party1Name);
                party2.setPlayerName(player2Name);
                party2.setPartyName(party2Name);


                var expeditionUser1Option = MainMenu.askForExpedition(player1Name);
                if (expeditionUser1Option.equals("1")) {
                    var expeditionPlayer1 = new Expedition(player1Name, party1);
                    while (!expeditionPlayer1.isFinished()) {
                        expeditionPlayer1.nextExpedition();
                    }

                }

                var expeditionUser2Option = MainMenu.askForExpedition(player2Name);
                if (expeditionUser2Option.equals("1")) {
                    var expeditionPlayer2 = new Expedition(player2Name, party2);
                    while (!expeditionPlayer2.isFinished()) {
                        expeditionPlayer2.nextExpedition();
                    }

                }
                MainMenu.printExpeditionsFinished();
                var battle = new Battle(party1, party2);

                while (!battle.isFinished()) {
                    battle.nextDuel();
                    BattleMenu.printGraveYard(battle);
                }
                BattleMenu.printBattleWinner (battle);
            } else {
                break;
            }
        }

    }

}