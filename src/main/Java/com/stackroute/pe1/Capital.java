package com.stackroute.pe1;
public class Capital
{
    public String capital(char m) {
        String result = "";
        //       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        if (m >= 97 && m <= 123) {
            result+= "Lower Case";
        } else if (m >= 65 && m <= 96) {
            result+= "Upper Case";
        } else if (m >= 48 && m <= 57) {
            result+= "Digit";
        } else {
            result+= "It's a special character";
        }
        return result;
    }
}
