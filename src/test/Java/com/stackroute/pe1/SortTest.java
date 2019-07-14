package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort intergerSort;

    @Before
    public void setUp() {
        //arrange
        intergerSort = new Sort();
    }

    @After
    public void tearDown() {
        intergerSort = null;
    }

    @Test
    public void givenNumberShouldReturnFalseOutput() {
        //act
        String actualResult = intergerSort.integerSorter(12345);
        //assert
        assertEquals("False", actualResult);
    }

    @Test
    public void givenNumberShouldReturnTrueOutput() {
        //act
        String actualResult = intergerSort.integerSorter(1888888);
        //assert
        assertEquals("True", actualResult);
    }
}
