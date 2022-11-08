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

    public static void printStringCharByCharHorizontally(String sentence) throws InterruptedException, IOException {
        var charArray = sentence.split("");
        String output = "";
        for(String c:charArray) {
            System.out.print(String.format("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b"));
            output = c + output;
            System.out.print(output + "\n");
            System.out.print(output + "\n");
            Thread.sleep(100);
        }
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
