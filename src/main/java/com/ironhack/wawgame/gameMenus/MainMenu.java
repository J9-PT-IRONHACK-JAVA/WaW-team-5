package com.ironhack.wawgame.gameMenus;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option;

        while(!exit){

            System.out.println("Empezar juego");
            System.out.println("Opciones");
            System.out.println("Salir");

            System.out.println("Escribe una de las opciones");
            option = sn.nextInt();

            switch(option){
                case 1:
                    System.out.println("Empieza el juego!");
                    break;
                case 2:
                    System.out.println("Opciones");
                    break;
                case 3:
                    exit=true;
                    break;
            }
        }
    }
}
