/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex24;

import ex24.Anagram;
import junit.framework.TestCase;


public class AnagramTest extends TestCase {

    public void testIsAnagram() {

        assertTrue(Anagram.isAnagram("plam", "mapl"));

    }
}