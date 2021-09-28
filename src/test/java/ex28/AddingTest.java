/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex28;

import junit.framework.TestCase;

public class AddingTest extends TestCase {

    public void testAddInput() {
        double[] numberList = new double[]{1, 2, 3, 4, 5};
        assertEquals(15.0, Adding.addInput(numberList));
    }
}