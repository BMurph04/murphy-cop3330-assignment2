/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex36;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class StatisticsTest extends TestCase {
    final private static ArrayList<Double> numberArray = new ArrayList<>();

    public static void numberList() {
        numberArray.add(100.0);
        numberArray.add(200.0);
        numberArray.add(1000.0);
        numberArray.add(300.0);
    }

    public void testAverage() {
        numberList();
        double sum = 0;
        for (Double s : numberArray) {
            sum += s;
        }
        assertEquals(400.0, sum / numberArray.size());
    }

    public void testMin() {
        numberList();
        assertEquals(100.0, Collections.min(numberArray));
    }

    public void testMax() {
        numberList();
        assertEquals(1000, Collections.max(numberArray));
    }
}