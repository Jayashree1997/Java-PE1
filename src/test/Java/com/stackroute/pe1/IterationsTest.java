package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;
public class IterationsTest {
    Iterations iterations;

    @Before
    public void setup() {
        System.out.println("Inside Before");
        this.iterations = new Iterations();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        iterations = null;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Test
    public void givenNumberShouldReturnString(){
        Iterations iterations = new Iterations();
        String actualResult = iterations.iteration(5);
        assertEquals("122333444455555", actualResult);
    }
    @Test
    public void givenValidNumberShouldReturnString(){
        Iterations iterations = new Iterations();
        String actualResult = iterations.iteration(10);
        assertEquals("Not a valid number",actualResult);
    }
}

