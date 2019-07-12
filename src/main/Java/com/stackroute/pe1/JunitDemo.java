package com.stackroute.pe1;

public class JunitDemo {
    public String concatAndUpperCase(String str1,String str2)

    {
        if(str1 ==null || str2==null){
            return("Null Value Not Allowed");
        }
        String concattedString=str1.concat(str2);
        return concattedString.toUpperCase();
    }
    public String reverseString(String value) {

        StringBuffer sb = new StringBuffer(value);
        System.out.println("string: " + sb);
        // reversing of stringbuffer
        System.out.println("reverse: " + sb.reverse());
        return sb.toString();
    }
}
