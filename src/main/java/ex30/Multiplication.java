/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex30;

public class Multiplication {

    public static String newLine() {
        return "\n";
    }
    public static int nextNum(int nextNum, int addNum){
        nextNum = nextNum + addNum;
        return nextNum;
    }

    public static void createTable(){
        for (int i = 1; i <= 12; i++) {
            int next = i;
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%3d ", next);
                next = nextNum(next, i);
            }
            System.out.print(newLine());
        }
    }

    public static void main(String[] args) {
        createTable();
    }



}
