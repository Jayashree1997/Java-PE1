package com.stackroute.pe1;
import java.util.Scanner;

public class Total{

    public static void main(String args[]) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of integers: ");
        int intNumberOfIntegers = scanner.nextInt();

        int intStorage[] = new int[intNumberOfIntegers];

        System.out.println("Please Enter numbers!");

        for(int i = 0;i < intStorage.length;i++) {
            intStorage[i] = scanner.nextInt();
            sum=sum+intStorage[i];
        }

        System.out.println("Your numbers are");

        for(int i = 0;i < intStorage.length;i++) {
            System.out.print(intStorage[i] + " ");
        }

        System.out.print("Final result is "+sum);
    }
}
