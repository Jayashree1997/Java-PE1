package com.stackroute.pe1;

import java.util.Scanner;

 public class Vowels
    {
        public String vowel(String s){
            String result="";
           // Scanner scan = new Scanner(System.in);
           // System.out.println("enter the string");
            //String s = scan.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                            s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'O' ||
                            s.charAt(i) == 'I' || s.charAt(i) == 'U') {
                        result+=  "Vowel";
                    } else {
                        result+="Consonant";
                    }
                } else
                 result+="is not alphabet";
            }
            return result;
        }
    }

