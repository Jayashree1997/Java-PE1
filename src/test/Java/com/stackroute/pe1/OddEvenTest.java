package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {

    OddEven oddEven;
    @Before
    public void setUp() throws Exception {
        oddEven = new OddEven();
    }

    @After
    public void tearDown() throws Exception {
        oddEven = null;
    }

    @Test
    public void givenNumberShouldReturnString() {
        String result = oddEven.OddEven(25);
        assertEquals("Tom",result);
        result = oddEven.OddEven(22);
        assertEquals("Jerry",result);
    }

    @Test
    public void givenNumberShouldReturnNull() {
        String result = oddEven.OddEven(55);
        assertNull(result);
    }
}