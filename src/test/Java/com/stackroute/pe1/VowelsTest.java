package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;
public class VowelsTest {
    Vowels vowels;

    @Before
    public void setup() {
        System.out.println("Inside Before");
        this.vowels = new Vowels();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        vowels = null;
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
    public void givenAStringShouldReturnVowelAndConsonantAndAlphabet() {
        Vowels vowels = new Vowels();
        String actualResult = vowels.vowel("Mansi");
        assertEquals("ConsonantVowelConsonantConsonantVowel", actualResult);
    }
    @Test
    public void givenAStringShouldReturnErrorMessage(){
        Vowels vowels = new Vowels();
        String actualResult = vowels. vowel("1");
        assertEquals("is not alphabet",actualResult );
    }
}