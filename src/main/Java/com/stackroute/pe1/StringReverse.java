package com.stackroute.pe1;



import java.util.Scanner;

public class StringReverse{
    public static void main(String[] args)
    {
        String x="";
        System.out.println("Enter the string");
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        for(int i=s.length()-1;i>=0;i--)
        {
            x=x+s.charAt(i);
        }
        System.out.println(x);

    }
}


