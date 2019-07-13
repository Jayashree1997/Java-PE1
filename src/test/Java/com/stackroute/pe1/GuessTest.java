package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;
public class GuessTest {
    Guess guess;

    @Before
    public void setup() {
        System.out.println("Inside Before");
        this.guess = new Guess();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        guess = null;
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
    public void givenAGuessShouldReturnNumberGuessedMatchesTheOriginalNumber() {
        Guess guess = new Guess();
        String actualResult = guess.guess(15);
        assertEquals("Number guessed matches the original number", actualResult);
    }


}
