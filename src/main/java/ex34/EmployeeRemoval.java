/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex34;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRemoval {

    final private static Scanner input = new Scanner(System.in);
    final private static ArrayList<String> employeeArray = new ArrayList<>();

    public static void employeeList() {
        employeeArray.add("John Smith");
        employeeArray.add("Jane Jackson");
        employeeArray.add("Chris Jones");
        employeeArray.add("Amanda Cullen");
        employeeArray.add("Jeremy Goodwin");
    }

    public static boolean removeEmployee(String removeEmp){
        for(int i = 0; i < employeeArray.size(); i++){
            if(removeEmp.equals(employeeArray.get(i))){
                employeeArray.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void printList(){
        for (String s : employeeArray) {
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        System.out.println("There are 5 employees: ");
        employeeList();
        printList();

        System.out.println("Enter an employee to remove: ");
        removeEmployee(input.nextLine());
        System.out.println("There are "+employeeArray.size()+" employees:");
        printList();

    }
    


}


