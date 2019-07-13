package com.stackroute.pe1;

import java.util.Scanner;
            public class OddEven{
                public String OddEven(int number) {
                    if ((number % 2 != 0) && (number >= 20 && number <= 30)) {
                        return "Tom";
                    } else if ((number % 2 == 0) && (number >= 20 && number <= 30)) {
                        return ("Jerry");
                    }
                    return null;
                }
            }


