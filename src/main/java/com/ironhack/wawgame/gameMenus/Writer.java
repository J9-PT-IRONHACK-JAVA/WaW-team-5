package com.ironhack.wawgame.gameMenus;

import java.io.*;
import java.util.Scanner;

public class Writer {
    public static void printFileLineByLine(String path, int speed) throws FileNotFoundException, InterruptedException {
        File partyFile = new File(path);
        Scanner reader = new Scanner(partyFile);
        while (reader.hasNext()) {
            String[] lineCut;
            var line = reader.nextLine();
            System.out.println(line);
            Thread.sleep(speed);
        }
    }

    public static void printStringCharByCharHorizontally(String sentence, int speed) {

        var charArray = sentence.split("");
        String output = "";
        for(String c:charArray) {
            output = output + c;
            System.out.print(c);
            try{Thread.sleep(speed);}catch (Exception e){}
            // Scanner scanner = new Scanner(System.in);
            // try{Thread.sleep(speed);}catch (Exception e){}
            // var in = scanner.next();
            // if (in.equals("\n")){
            //     scanner.close();
            //     System.out.print(sentence.substring(0, c.length()));
            //     break;
            // }
            // scanner.close();
        }
    }

    public static void cleanConsole() {
        System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
    }
    public static void convertCharToFont(char c) throws FileNotFoundException, InterruptedException {
        switch (c){
            case 'a':
                printFileLineByLine("", 100);
            default:
                printFileLineByLine("", 100);
        }
    }
}
