/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex33;

import junit.framework.TestCase;
import org.junit.Test;

public class MagicBallTest extends TestCase {

    @Test
    public void testRandomNumber() {
        int random = MagicBall.randomNumber();
        int min = 1;
        int max = 4;
        assertFalse("Number too high", random > max);
        assertFalse("Number too low", random < min);
    }
}