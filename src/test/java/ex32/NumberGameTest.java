/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex32;

import junit.framework.TestCase;

public class NumberGameTest extends TestCase {

    public void testMaxValue() {
        assertEquals(10, NumberGame.maxValue(1));
        assertEquals(100, NumberGame.maxValue(2));
        assertEquals(1000, NumberGame.maxValue(3));
    }

}