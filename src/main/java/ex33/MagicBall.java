/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    final private static Random rand = new Random();
    final private static Scanner input = new Scanner(System.in);

    public static int randomNumber() {
        int min = 1;
        int max = 4;
        return rand.nextInt((max - min) + 1) + min;
    }

    public static String[] ballChoices() {
        String[] choicesArray = new String[5];
        choicesArray[0] = "Yes";
        choicesArray[1] = "No";
        choicesArray[2] = "Maybe";
        choicesArray[3] = "Ask again later";
        return choicesArray;
    }

    public static String chooseChoice(int number, String[] choice){
        switch(number){
            case 1: return choice[0];
            case 2: return choice[1];
            case 3: return choice[2];
            case 4: return choice[3];
        }
        return "";
    }

    public static void main(String[] args){
        System.out.println("What is your question?");
        input.next();
        System.out.println(chooseChoice(randomNumber(),ballChoices()));
    }
}
