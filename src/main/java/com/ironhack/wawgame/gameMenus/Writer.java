package com.ironhack.wawgame.gameMenus;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Writer {

    public static final int LOG_SPEED = 2;
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

    public static void printStringLineByLine(String paragraph, int speed) {
        var lines = paragraph.split("\n");
        for (String line: lines) {
            System.out.println(line);
            try{Thread.sleep(speed);}catch (Exception e){};
        }
    }

    public static void printStringCharByCharHorizontally(String sentence, int speed) {

        var charArray = sentence.split("");
        String output = "";
        for(String c:charArray) {
            output = output + c;
            System.out.print(c);
            try{Thread.sleep(speed);}catch (Exception e){}
        }
    }

    public static void cleanConsole() {
        System.out.print("\u001B[0m");
        System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
    }

    public static void printLifeBars(int hp1, int remainingHp1, int hp2, int remainingHp2) {
        System.out.print("\u001B[31m"+getBarLife(hp1,remainingHp1) +" HP:"+remainingHp1 +"      \u001B[31m"+ getBarLife(hp2,remainingHp2)+" HP:"+remainingHp2 );
    }

    public static String getBarLife(int life, int remainingLife) {
        double percentatgeLosedLife = (double) (life - remainingLife)/(double)life;
        char incomplete = '░'; // U+2591 Unicode Character
        char complete = '█'; // U+2588 Unicode Character
        StringBuilder builder = new StringBuilder();
        Stream.generate(() -> complete).limit(25).forEach(builder::append);
        int remainingLifeBars = 25 - (int)(25.0 * percentatgeLosedLife);
        builder.replace(remainingLifeBars,25,new String(new char[25-remainingLifeBars]).replace("\0", String.valueOf(incomplete)));
        return builder.toString();
    }
    public static String addCharacterToBeginAndEndOfString(String c, String word, int length)  {
        if (word.length() < length) {
            for (int i =word.length(); i < length; i++) {
                if (i%2==0) {
                    word = word + c;
                } else {
                    word = c + word;
                }
            }
        }
        return word;
    }

    public static String askSomethingToUser(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
