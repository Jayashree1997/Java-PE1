package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalTest {
    Total integerSum;

    @Before
    public void setUp() {
        //arrange
        integerSum = new Total();
    }

    @After
    public void tearDown() {
        integerSum = null;
    }

    @Test
    public void givenInputZeroShouldReturnZero() {
        //act
        int actualResult = integerSum.integerAdd(2, 0);
        //assert
        assertEquals(0, actualResult);
    }

    @Test
    public void givenInputShouldReturnSum() {
        //act
        int actualResult = integerSum.integerAdd(2, 2);
        //assert
        assertEquals(4, actualResult);
    }
}
