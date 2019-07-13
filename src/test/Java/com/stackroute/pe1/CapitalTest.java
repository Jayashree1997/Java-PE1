package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;
public class CapitalTest {
    Capital capital;

    @Before
    public void setup() {
        System.out.println("Inside Before");
        this.capital = new Capital();
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
        capital = null;
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
  public void givenStringShouldReturnLowerCase()
  {
      Capital capital = new Capital();
      String actualResult = capital.capital('a');
      assertEquals("Lower Case", actualResult);
  }
    @Test
    public void givenStringShouldReturnUpperCase()
    {
        Capital capital = new Capital();
        String actualResult = capital.capital('A');
        assertEquals("Upper Case", actualResult);
    }
    @Test
    public void givenStringShouldReturnDigit()
    {
        Capital capital = new Capital();
        String actualResult = capital.capital('6');
        assertEquals("Digit", actualResult);
    }
    @Test
    public void givenStringShouldReturnSpecialCharacter()
    {
        Capital capital = new Capital();
        String actualResult = capital.capital('@');
        assertEquals("It's a special character", actualResult);
    }
}
