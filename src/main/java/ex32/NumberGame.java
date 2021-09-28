/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex32;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class NumberGame {
    final private static Random rand = new Random();
    final private static Scanner input = new Scanner(System.in);

    public static void validIntInput(String prompt) {
        System.out.println(prompt);
        boolean isInvalid = !input.hasNextInt();

        while (isInvalid) {
            isInvalid = !input.hasNextInt();
            if (isInvalid) {
                System.out.println("Error. Please enter a valid input.");
                input.next();
            }
        }
    }
    public static void validStringInput(String prompt) {
        System.out.println(prompt);
        boolean isInvalid = true;
        while (isInvalid) {
            if(input.hasNext("Y") || input.hasNext("N"))
                isInvalid = false;
            else{
                isInvalid = true;
            }
            if (isInvalid) {
                System.out.println("Error. Please enter a valid input.");
                input.next();
            }
        }
    }

    public static int maxValue(int difficulty){
        int max = 0;
        if (difficulty == 1) {
            max = 10;
        }
        else if (difficulty == 2) {
            max = 100;
        }
        else if (difficulty == 3) {
            max = 1000;
        }
        return max;
    }

    public static int randomNumber(int max){
        int min = 1;
        return rand.nextInt((max - min) + 1) + min;
    }

    public static int randomGame(int max){
        int randomNumber = randomNumber(max);
        System.out.println("I have my number. Start guessing!");
        String guess;
        int guessCount = 1;
        int finalGuessCount = 0;
        do{
            guess = input.next();
            try {
                if (parseInt(guess) < randomNumber) {
                    System.out.println("Too low. Guess again.");
                } else if (parseInt(guess) > randomNumber) {
                    System.out.println("Too high. Guess again.");
                } else if (parseInt(guess) == randomNumber) {
                    finalGuessCount = guessCount;
                }
            }
            catch(Exception e){
                System.out.println("Unexpected input. Guess again.");
                guess = "-1";
            }
            guessCount++;
        }while(parseInt(guess) != randomNumber);
        return finalGuessCount;
    }

    public static void main(String[] args) {
        String playAgain;
        do {
            validIntInput("Enter the difficulty level (1, 2, or 3): ");
            int difficulty = parseInt(input.next());
            int max = maxValue(difficulty);
            int finalGuesses = randomGame(max);
            System.out.println("You got it in "+finalGuesses+" guesses!");

            validStringInput("Do you want to play again (Y/N)?");
            playAgain = input.next();
        }while(playAgain.equals("Y"));
    }
}
