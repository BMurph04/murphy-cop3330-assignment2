/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex29;

import junit.framework.TestCase;

public class BadInputTest extends TestCase {

    public void testCalculateYears() {
        assertEquals(18.0, BadInput.calculateYears(4));
        assertEquals(36.0, BadInput.calculateYears(2));
    }
}