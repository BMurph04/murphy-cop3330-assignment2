/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex30;

import junit.framework.TestCase;

public class MultiplicationTest extends TestCase {

    public void testNextNum() {
        assertEquals(18, Multiplication.nextNum(9,9));
    }
}