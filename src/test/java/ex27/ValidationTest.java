/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex27;

import junit.framework.TestCase;

public class ValidationTest extends TestCase {

    public void testValidateFirstName() {
        assertEquals("First name must be at least 2 characters long.\n", Validation.validateFirstName("k"));
        assertEquals("First name must be filled in as letters.\n", Validation.validateFirstName("      "));
    }

    public void testValidateLastName() {
        assertEquals("Last name must be at least 2 characters long.\n", Validation.validateLastName("o"));
        assertEquals("Last name must be filled in as letters.\n", Validation.validateLastName("       "));
    }

    public void testValidateID() {
        assertEquals("The employee ID must be in the format of AA-1234.\n", Validation.validateID("212-wdao"));
    }

    public void testValidateZIP() {
        assertEquals("The zipcode must be a 5 digit number.\n", Validation.validateZIP("313910931"));
    }

    public void testValidateInput() {
        assertEquals("", Validation.validateFirstName("John")+Validation.validateLastName("Stalvey")+Validation.validateID("AW-1042")+Validation.validateZIP("34787"));
    }
}