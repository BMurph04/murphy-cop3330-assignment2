/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex31;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class HeartRate {
    final private static Scanner input = new Scanner(System.in);

    public static void validInput(String prompt){
        System.out.println(prompt);
        boolean isInvalid = !input.hasNextDouble();
        while(isInvalid){
            isInvalid = !input.hasNextDouble();
            if(isInvalid){
                System.out.println("Error. Please enter a valid input.");
                input.next();
            }
        }
    }

    public static double calculateRate(double pulse, double age, double intensity){
        return (((220 - age) - pulse) * (intensity/100.0)) + pulse;

        }
    public static void createTable(double pulse, double age){
        double targetHeartRate;
        System.out.printf("Intensity | Rate\n");
        System.out.print("----------|---------\n");
        for(int i = 55; i <= 95; i+= 5){
            targetHeartRate = Math.round(calculateRate(pulse, age, i));
            System.out.printf("%2d%%      | %3.0f bpm   ", i, targetHeartRate);
            System.out.printf("\n");
        }
    }



    public static void main(String[] args){
        validInput("Resting Pulse: ");
        double pulse = parseDouble(input.next());
        validInput("Age: ");
        double age = parseDouble(input.next());

        createTable(pulse, age);


    }
}
