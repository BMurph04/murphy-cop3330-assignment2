/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Brendon Murphy
 */
package ex34;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

public class EmployeeRemovalTest extends TestCase {

    @Test
    public void testRemoveEmployee() {
        EmployeeRemoval.employeeList();
        assertEquals(true, EmployeeRemoval.removeEmployee("Amanda Cullen"));
        assertEquals(false, EmployeeRemoval.removeEmployee("John Bob"));
    }
}