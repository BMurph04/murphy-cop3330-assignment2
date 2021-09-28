/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex31;

import junit.framework.TestCase;

public class HeartRateTest extends TestCase {

    public void testCalculateRate() {
        assertEquals(138, Math.round(HeartRate.calculateRate(65, 22, 55)));
    }
}