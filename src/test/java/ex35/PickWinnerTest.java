/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex35;

import ex33.MagicBall;
import junit.framework.TestCase;
import org.junit.Test;

public class PickWinnerTest extends TestCase {

    @Test
    public void testRandomNumber() {
        int random = PickWinner.randomNumber();
        int min = 0;
        int max = 5;
        assertFalse("Number too high", random > max);
        assertFalse("Number too low", random < min);
    }
}