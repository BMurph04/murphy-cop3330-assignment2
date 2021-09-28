/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PickWinner {
    final private static Scanner input = new Scanner(System.in);
    final private static ArrayList<String> contestantArray = new ArrayList<>();
    final private static Random rand = new Random();

    public static void contestantList(){
        String name;
        do{
            System.out.println("Enter a name: ");
            name = input.nextLine();
            if(!name.equals(""))
                contestantArray.add(name);
        }while(!name.equals(""));


    }

    public static int randomNumber() {
        int min = 0;
        int max = contestantArray.size();
        return rand.nextInt(max+1);
    }
    public static String pickWinner(int winnerIndex){
        for(int i = 0; i < contestantArray.size(); i++){
            if(i == winnerIndex){
                return contestantArray.get(i);
            }
        }
        return "";
    }


    public static void main(String[] args){
        contestantList();
        String winner = pickWinner(randomNumber());
        System.out.println("The winner is... "+winner+"!");
    }
}
