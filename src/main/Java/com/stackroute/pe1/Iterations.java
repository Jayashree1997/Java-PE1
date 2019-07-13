package com.stackroute.pe1;

//import java.util.Scanner;

public class Iterations
{

    public String iteration(int num){
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of iterations: ");
        //int num = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                if(num>=0&&num<=9)
                result.append(i);
                else
                    return "Not a valid number";
            }
        }return (result.toString());
    }
}
