/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex26;

import junit.framework.TestCase;

public class PaymentCalculatorTest extends TestCase {

    public void testCalculateMonthsUntilPaidOff() {
        assertEquals(70.0, PaymentCalculator.calculateMonthsUntilPaidOff(5000,12,100));
    }
}