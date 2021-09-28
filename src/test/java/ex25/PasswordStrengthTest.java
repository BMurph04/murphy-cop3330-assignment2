/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex25;

import junit.framework.TestCase;

public class PasswordStrengthTest extends TestCase {

    public void testPasswordValidator() {
        assertEquals(3, PasswordStrength.passwordValidator("a@OKQwEF832"));
        assertEquals(2, PasswordStrength.passwordValidator("aOKQwEF832"));
        assertEquals(1, PasswordStrength.passwordValidator("seAkW"));
        assertEquals(0, PasswordStrength.passwordValidator("3214"));
    }
}