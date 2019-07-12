package com.stackroute.pe1;
import java.util.Random;
import java.util.Scanner;

public class Guess {

        /*Minimum limit for random number*/
        private static final int min = 1;
        /*Maximum limit for random number*/
        private static final int max = 50;

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Random random = new Random();
            /*Pick a random number within the "min" and "max" limit*/
            final int pickedNumber = random.nextInt((max - min) + 1) + min;
            System.out.println("Picked Number: " + pickedNumber);
            /*Used to store the input from the user*/
            int guess = 0;
            /*Loop until the user guesses correctly*/
            while (true) {
                System.out.println("Enter your guess: ");
                guess = s.nextInt();
                if (guess == pickedNumber){
                    System.out.println("Number guessed matches the original number");
                    break;
                } else if (guess > pickedNumber) {
                    System.out.println("Number guessed is more than original number");
                } else {
                    System.out.println("Number guessed is less than original number");
                }
            }
            /*Close the scanner*/
            s.close();
        }
    }

