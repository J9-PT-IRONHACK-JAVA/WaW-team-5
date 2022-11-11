package com.ironhack.wawgame.gameMenus;

import com.ironhack.wawgame.gameServices.Game;

public class MainMenu {

    public static void welcomeMessage () {
        String welcomeMessage = """
        ░██╗░░░░░░░██╗██╗███████╗░█████╗░██████╗░██████╗░░██████╗  ░█████╗░███╗░░██╗██████╗░  ░██╗░░░░░░░██╗░█████╗░██████╗░██████╗░██╗░█████╗░██████╗ ░░██████╗
        ░██║░░██╗░░██║██║╚════██║██╔══██╗██╔══██╗██╔══██╗██╔════╝  ██╔══██╗████╗░██║██╔══██╗  ░██║░░██╗░░██║██╔══██╗██╔══██╗██╔══██╗██║██╔══██╗██╔══██╗ ██╔════╝
        ░╚██╗████╗██╔╝██║░░███╔═╝███████║██████╔╝██║░░██║╚█████╗░  ███████║██╔██╗██║██║░░██║  ░╚██╗████╗██╔╝███████║██████╔╝██████╔╝██║██║░░██║██████╔╝ ╚█████╗░
        ░░████╔═████║░██║██╔══╝░░██╔══██║██╔══██╗██║░░██║░╚═══██╗  ██╔══██║██║╚████║██║░░██║  ░░████╔═████║░██╔══██║██╔══██╗██╔══██╗██║██║░░██║██╔══██╗ ░╚═══██╗
        ░░╚██╔╝░╚██╔╝░██║███████╗██║░░██║██║░░██║██████╔╝██████╔╝  ██║░░██║██║░╚███║██████╔╝  ░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║██║░░██║██║╚█████╔╝██║░░██║ ██████╔╝
        ░░░╚═╝░░░╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░╚═════╝░  ╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░  ░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░╚════╝░╚═╝░░╚═╝░╚═════╝░
        
        
        """;
        Writer.printStringLineByLine(welcomeMessage,250);
    }

    public static String askForGameAndGetResponseFromUser(Game game) {
        return game.askSomethingToUser("""
                                ▒█▀▀▄ █▀▀█ 　 █░░█ █▀▀█ █░░█ 　 █░░░█ █▀▀█ █▀▀▄ ▀▀█▀▀ 　 ▀▀█▀▀ █▀▀█ 　 █▀▀█ █░░ █▀▀█ █░░█ 　 █▀▀█   █▀▀▀ █▀▀█ █▀▄▀█ █▀▀ ▀█                
                                ▒█░▒█ █░░█ 　 █▄▄█ █░░█ █░░█ 　 █▄█▄█ █▄▄█ █░░█ ░░█░░ 　 ░░█░░ █░░█ 　 █░░█ █░░ █▄▄█ █▄▄█ 　 █▄▄█   █░▀█ █▄▄█ █░▀░█ █▀▀ █▀                
                                ▒█▄▄▀ ▀▀▀▀ 　 ▄▄▄█ ▀▀▀▀ ░▀▀▀ 　 ░▀░▀░ ▀░░▀ ▀░░▀ ░░▀░░ 　 ░░▀░░ ▀▀▀▀ 　 █▀▀▀ ▀▀▀ ▀░░▀ ▄▄▄█ 　 ▀░░▀   ▀▀▀▀ ▀░░▀ ▀░░░▀ ▀▀▀ ▄░
                                
                Type yes or no.                                
                """);
    }

    public static String askForAnotherGameAndGetResponseFromUser(Game game) {
        return game.askSomethingToUser("Do you want to play again");
    }
    public static String printOptionsMenuAndGetOptionFromUser(Game game) {
        String options = """
                    How do you want to create the parties?
                    1. Import parties from csv
                    2. Generate parties randomly
                    """;
        return game.askSomethingToUser(options);
    }

    public static String printCsvOptionAndGetPathFromUser(Game game, String party) {
        return game.askSomethingToUser("Please write the path to the party %s csv".formatted(party));
    }

    public static String askUserForHisName(Game game, int playerNumber) {
        return game.askSomethingToUser("Player%s, which is your name?".formatted(playerNumber));
    }
    public static String askUserForTeamName(Game game) {
        return game.askSomethingToUser("Give a name to your team!! The one that will protect you from the darkness.... or maybe... the one that will bet finally the light!! HAHAHA");
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
