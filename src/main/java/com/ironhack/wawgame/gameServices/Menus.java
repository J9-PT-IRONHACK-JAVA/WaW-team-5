package com.ironhack.wawgame.gameServices;

import com.ironhack.wawgame.gameObjects.*;
import com.ironhack.wawgame.gameObjects.Character;

import java.util.ArrayList;
import java.util.Scanner;

public class Menus {

    public static void welcomeMessage () {
        System.out.println("░██╗░░░░░░░██╗░█████╗░██████╗░██████╗░██╗░█████╗░██████╗ ░░██████╗  ░█████╗░███╗░░██╗██████╗░  ░██╗░░░░░░░██╗██╗███████╗░█████╗░██████╗░██████╗░░██████╗");
        System.out.println("░██║░░██╗░░██║██╔══██╗██╔══██╗██╔══██╗██║██╔══██╗██╔══██╗ ██╔════╝  ██╔══██╗████╗░██║██╔══██╗  ░██║░░██╗░░██║██║╚════██║██╔══██╗██╔══██╗██╔══██╗██╔════╝");
        System.out.println("░╚██╗████╗██╔╝███████║██████╔╝██████╔╝██║██║░░██║██████╔╝ ╚█████╗░  ███████║██╔██╗██║██║░░██║  ░╚██╗████╗██╔╝██║░░███╔═╝███████║██████╔╝██║░░██║╚█████╗░");
        System.out.println("░░████╔═████║░██╔══██║██╔══██╗██╔══██╗██║██║░░██║██╔══██╗ ░╚═══██╗  ██╔══██║██║╚████║██║░░██║  ░░████╔═████║░██║██╔══╝░░██╔══██║██╔══██╗██║░░██║░╚═══██╗");
        System.out.println("░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║██║░░██║██║╚█████╔╝██║░░██║ ██████╔╝  ██║░░██║██║░╚███║██████╔╝  ░░╚██╔╝░╚██╔╝░██║███████╗██║░░██║██║░░██║██████╔╝██████╔╝");
        System.out.println("░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░╚════╝░╚═╝░░╚═╝░╚═════╝░  ╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░  ░░░╚═╝░░░╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░╚═════╝░\n");
        System.out.println("\n\n");
    }

    //Preguntar al usuario si quiere empezar el juegoo
    public static String doYouWantStartGame () {
        var scanner = new Scanner(System.in);
        System.out.println("Do you want to start game (Y/N)?");
        return scanner.nextLine();
    }

    //Pregunta el nombre del player
    //@return String con el nombre del jugador
    public static String getPlayerName (int numberOfPlayer) {
        var scanner = new Scanner(System.in);
        System.out.println("Input Player "+numberOfPlayer+" name: ");
        return scanner.nextLine();
    }






    //Comienzo del duelo n
    public static void duelBegins (int numberOfDuel) {
        System.out.println("Duel "+numberOfDuel+":");
    }

    //Mensaje para que el jugador elija el combatiente a luchar en el duelo
    //@return character, es el Character elegido por el jugador para luchar en el duelo
    public static Character getCharacterForDuel (int playerNumber,Party party) {
        var scanner =  new Scanner(System.in);
        System.out.println("\nPLAYER " + playerNumber +":");
        System.out.println("Choose id Character to duel: "); //Elegirlo por iD
        int iDCharacter1 = scanner.nextInt();
        return party.getCharacterById (iDCharacter1);
    }

    //Imprimir combatientes del duelo
    public static void printDuelCombatants(int numberOfDuel, Character combatant1, Character combatant2) {
        System.out.println("The combatants of duel "+numberOfDuel+" are");
        System.out.println(combatant1);
        System.out.println(combatant2);
    }

    //Imprirmir log del duelo
    public static void  printDuelLogs (Character attacker, Character defender) {
        System.out.println(attacker.getName() + "ataca a "+defender.getName());
        if (defender.getHp() <=0) {
            System.out.println(defender.getName () +" died");
        }
    }

    //Imprimir tipo de ataque



}//class ends
