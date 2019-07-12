package com.stackroute.pe1;

import java.util.Scanner;

    public class Palindrome {

        public static void main(String[] args) {

            long inputValue;
            long result=0;
            long sum=0;
            long value;

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Number : ");
            inputValue = in.nextLong();
            System.out.println("Your entered integer " + inputValue);
            int length = (int)(Math.log10(inputValue)+1);
            System.out.println("Length of integer is --" + length);

            while(length >= 0){
                value = inputValue %10;
                if(value%2==0){
                    sum = sum+value;
                }
                result = 0*10+ inputValue;
                inputValue = inputValue/10;
                length--;
            }
            if(result==inputValue){
                System.out.println("Sucess, a palindrome");
            }
            else{
                System.out.println("Failue, not a palindrome    ");
            }
            if(sum>25){
                System.out.println("Greater than 25 , Number is--- "+sum);
            }else {
                System.out.println("Not greater than 25");
            }
        }
    }

