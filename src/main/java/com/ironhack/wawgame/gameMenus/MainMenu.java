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
        \n
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

    public static String askForAnotherGameAndGetResponseFromUser() {
        return Writer.askSomethingToUser("Do you want to play again");
    }
    public static String printOptionsMenuAndGetOptionFromUser() {
        String options = """
                    How do you want to create the parties?
                    1. Import parties from csv
                    2. Generate parties randomly
                    """;
        return Writer.askSomethingToUser(options);
    }

    public static String printCsvOptionAndGetPathFromUser(String party) {
        return Writer.askSomethingToUser("Please write the path to the party %s csv".formatted(party));
    }

    public static String askUserForHisName(int playerNumber) {
        return Writer.askSomethingToUser("Player%s, which is your name?".formatted(playerNumber));
    }
    public static String askUserForTeamName() {
        return Writer.askSomethingToUser("Give a name to your team!! The one that will protect you from the darkness.... or maybe... the one that will bet finally the light!! HAHAHA");
    }

    public static String askForExpedition(String playerName) {
        String options = """
                    Player %s do you want to go to an expedition quest to get powerfull weapons?
                    1. Yes, lets bet some monsters.
                    2. No, I prefer to bet my opponent.
                    """.formatted(playerName);
        return Writer.askSomethingToUser(options);
    }

    public static void printExpeditionsFinished() {
        Writer.printStringCharByCharHorizontally("The expeditions finish, let's battle!!\n", Writer.LOG_SPEED);
    }

}
