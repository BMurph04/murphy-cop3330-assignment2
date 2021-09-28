/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex28;

import java.util.Scanner;

public class Adding {

    final private static Scanner input = new Scanner(System.in);



    public static double getNumber(){
        return input.nextDouble();
    }

    public static double addInput(double numberList[]){
        double sum = 0;
        for(int i = 0; i < numberList.length; i++){
            sum += numberList[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] numberList = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            numberList[i] = getNumber();
        }
        double sum = addInput(numberList);
        System.out.println("The total is "+sum+".");

    }
}
