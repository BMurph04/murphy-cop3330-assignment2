/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex29;

import java.util.Scanner;

public class BadInput {

    final private static Scanner input = new Scanner(System.in);



    public static String printResult(double years){
            return "It will take "+years+" years to double your initial investment.";
    }

    public static double calculateYears(double rate) {
        return 72 / rate;
    }

    public static void testValid(boolean isValid, double years){

        do{
            System.out.println("What is the rate of return?");
            isValid = input.hasNextDouble();
            if(!isValid){
                System.out.println("Sorry. That's not a valid input.");
                input.next();
            }
            else{
                double rate = input.nextDouble();
                if(rate == 0){
                    System.out.println("Sorry. That's not a valid input.");
                    isValid = false;
                }
                else {

                    years = calculateYears(rate);
                    System.out.println(printResult(years));
                }
            }
        }while(!isValid);
    }

    public static void main(String[] args)
    {
        double years = 0;
        boolean valid = true;

        testValid(valid, years);

    }
}
