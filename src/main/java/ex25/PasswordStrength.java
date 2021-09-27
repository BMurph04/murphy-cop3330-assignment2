/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Brendon Murphy
 */
package ex25;

import java.util.Scanner;

public class PasswordStrength {

    final private static Scanner input = new Scanner(System.in);


    public static int passwordValidator(String str){
        if (str.length() >= 8 && (str.matches("[a-zA-Z0-9]+") || str.matches("[a-zA-Z]+"))){
            return 2;
        }
        else if (str.length() >= 8){
            return 3;
        }
        else if(str.matches("[a-zA-Z]+")){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static String printResult(String password, int strength){
        switch(strength) {
            case 3:
                return password+" is a very strong password.";
            case 2:
                return password+" is a strong password.";
            case 1:
                return password+" is a weak password.";
            case 0:
                return password+" is a very weak password.";
        }
        return "Error";
    }


    public static String getString(){
        return input.nextLine();
    }

    public static void main(String[] args)
    {
        System.out.print("Enter your password: ");
        String password = getString();
        int strength = passwordValidator(password);
        System.out.println(printResult(password, strength));
    }
}
