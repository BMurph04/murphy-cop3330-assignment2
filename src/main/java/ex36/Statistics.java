/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex36;

import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Statistics {
    final private static Scanner input = new Scanner(System.in);
    final private static ArrayList<Double> numberArray = new ArrayList<>();

    public static void validStringInput(String prompt) {
        System.out.println(prompt);
        boolean isInvalid = true;
        while (isInvalid) {
            if(input.hasNext("done"))
                isInvalid = false;
            else if(input.hasNextDouble()){
                isInvalid = false;
            }
            if (isInvalid) {
                System.out.println("Error. Please enter a valid input.");
                input.next();
            }
        }
    }

    public static void numberList(){
        String number;
        do{
            validStringInput("Enter a number: ");
            number = input.next();
            if(!number.equals("done"))
                numberArray.add(parseDouble(number));
        }while(!number.equals("done"));
    }
    public static void printList(){
        System.out.print("Numbers: ");
        for (Double s : numberArray) {
            System.out.printf("%s ",s);
        }
        System.out.print("\n");
    }
    public static double average(){
        double sum = 0;
        for (Double s : numberArray) {
            sum += s;
        }
        return ( sum/numberArray.size() );
    }
    public static double min(){
        return Collections.min(numberArray);
    }
    public static double max(){
        return Collections.max(numberArray);
    }
    public static double std(){
        double summation = 0;
        for (Double aDouble : numberArray) {
            summation += ((aDouble - average()) * (aDouble - average()));
        }
        return Math.sqrt(summation/(numberArray.size()));
    }



    public static void main(String[] args)
    {
        numberList();
        printList();
        System.out.println("The average is "+ average());
        System.out.println("The minimum is "+ min());
        System.out.println("The maximum is "+ max());
        System.out.printf("The standard deviation is %.2f", std());
    }

}
