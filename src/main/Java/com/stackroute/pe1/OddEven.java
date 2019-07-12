package com.stackroute.pe1;

import java.util.Scanner;

    public class OddEven {
        public static void main(String[] args)
        {
            System.out.println("Enter a number:" );
            Scanner input =new Scanner(System.in);
            int num = input.nextInt();

            if(num % 3 == 0 && num >= 20 && num<=30)
            {
                System.out.println("Tom");
            }
            if(num % 2 == 0 && num >= 20 && num <=30)
            {
                System.out.println("Jerry");
            }

        }
    }


