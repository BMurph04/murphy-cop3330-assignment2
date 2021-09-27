/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
    final private static Scanner input = new Scanner(System.in);

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] array1 = str1.toCharArray();
        Arrays.sort(array1);
        char[] array2 = str2.toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static String getString(){
        return input.nextLine();
    }

    public static String printResult(String str1, String str2){
        if(isAnagram(str1, str2)){
            return "\""+str1+"\" and \""+str2+"\" are anagrams.";
        }
        else
            return "\""+str1+"\" and \""+str2+"\" are not anagrams.";

}

    public static void main( String[] args )
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String str1 = getString();
        System.out.print("Enter the second string: ");
        String str2 = getString();
        System.out.println(printResult(str1, str2));
    }
}
