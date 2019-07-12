package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;
    @Before
        public void setup() {
            System.out.println("Inside Before");
            this.junitDemo=new JunitDemo();
        }
     @After
     public void tearDown(){
        System.out.println("Inside After");
        junitDemo=null;
     }
     @BeforeClass
     public static void beforeClass(){
        System.out.println("Before Class");
     }
     @AfterClass
     public static void afterClass(){
        System.out.println("After Class");
     }
    @Test
    public void givenTwoStringsShouldReturnConcattedUpperString() {
        JunitDemo junitDemo= new JunitDemo();
        String actualResult= junitDemo.concatAndUpperCase("hello","world");
        assertNotNull(actualResult);
        assertEquals( "HELLOWORLD",actualResult);
    }
    @Test
    public void givenTwoStringsAndNullShouldReturnErrorMessage(){
        JunitDemo junitDemo= new JunitDemo();
        String actualResult= junitDemo.concatAndUpperCase("hello", null);
        assertNotNull(actualResult);
        assertEquals( "Null Value Not Allowed",actualResult);

    }
    @Test
    public void givenStringShouldReturnTheReverse(){
        String actualResult= junitDemo.reverseString("Hello");
        assertEquals("olleH", actualResult);
    }
//   @Test
//    public void givenNullShouldThrowNullPointException(){
//       String actualResult= junitDemo.reverseString(null);
//
//   }

}