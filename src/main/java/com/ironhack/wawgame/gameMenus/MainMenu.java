package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameServices.Game;

public class MainMenu {
    public static String printOptionsMenuAndGetOptionFromUser(Game game) {
        String options = """
                    How do you want to create the parties?
                    1. Import parties from csv
                    2. Generate parties randomly
                """;
        return game.askSomethingToUser(options);
    }

    public static String printCsvOptionAndGetPathFromUser(Game game, int party) {
        return game.askSomethingToUser("Please write the path to the party %s csv".formatted(party));
    }

    public static String selectPartyMenu(Game game) {
        String options = """
                    Select party file:
                    1. Party 1
                    2. Party 2
                    3. Party 3
                    4. Party 4
                """;
        return game.askSomethingToUser(options);
    }

}
