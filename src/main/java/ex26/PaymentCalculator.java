/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex26;


import java.util.Scanner;

public class PaymentCalculator {
    final private static Scanner input = new Scanner(System.in);

    public static double calculateMonthsUntilPaidOff(double balance, double apr, double payment){
        double rate = (apr/100.0)/365.0;
        return Math.ceil(-(1.0/30.0) * Math.log(1.0 + balance/payment * (1.0 - Math.pow((1.0 + rate),30.0)) ) / Math.log(1.0 + rate));

    }

    public static double getDouble(){
       return input.nextDouble();
    }

    public static String printResult(int months){
        return "It will take you "+months+" months to pay off this card.";
    }

    public static void main(String[] args)
    {
        System.out.println("What is your balance?");
        double balance = getDouble();
        System.out.println("What is the APR on the card (as a percent)?");
        double apr = getDouble();
        System.out.println("What is the monthly payment you can make?");
        double payment = getDouble();

        int months = (int)calculateMonthsUntilPaidOff(balance, apr, payment);
        System.out.println(printResult(months));
    }
}

