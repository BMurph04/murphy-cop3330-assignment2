/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex27;


import java.util.Scanner;

public class Validation {

    final private static Scanner input = new Scanner(System.in);

    public static String validateFirstName(String name) {
        if (name.length() < 2)
            return "First name must be at least 2 characters long.\n";
        if (!name.matches("[a-zA-Z]+"))
            return "First name must be filled in as letters.\n";
        return "";
    }

    public static String validateLastName(String name) {
        if (name.length() < 2)
            return "Last name must be at least 2 characters long.\n";
        if (!name.matches("[a-zA-Z]+"))
            return "Last name must be filled in as letters.\n";
        return "";
    }

    public static String validateID(String id) {
        if (!id.matches("[a-zA-Z][a-zA-Z][-]\\d\\d\\d\\d"))
            return "The employee ID must be in the format of AA-1234.\n";
        return "";
    }

    public static String validateZIP(String zip) {
        if (!zip.matches("\\d\\d\\d\\d\\d"))
            return "The zipcode must be a 5 digit number.\n";
        return "";
    }

    public static String validateInput(String firstName, String lastName, String zip, String id) {
        String output = validateFirstName(firstName) + validateLastName(lastName) + validateID(id) + validateZIP(zip);
        if (output.equals(""))
            return "There were no errors found.";
        else
            return output;
    }

    public static String getString(){
        return input.nextLine();
    }

    public static void main(String[] args){

        System.out.println("Enter the first name:");
        String firstName = getString();
        System.out.println("Enter the last name:");
        String lastName = getString();
        System.out.println("Enter the ZIP code:");
        String zip = getString();
        System.out.println("Enter the employee ID:");
        String id = getString();


        System.out.print(validateInput(firstName, lastName, zip, id));
    }
}
