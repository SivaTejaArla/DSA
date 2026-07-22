/*
In this problem we need to eliminate the specific characters from the given string and return the output using Recursion.

*/

import java.util.*;

class Main {
    
    static StringBuilder resultString(String a, int n, StringBuilder result){
        if(a.length() == 0) return new StringBuilder("Invalid Input");
        if(n>=a.length()) return result; 
        if(a.charAt(n) != 'a' && a.charAt(n) != 'A') result.append(a.charAt(n));
        resultString(a,n+1,result);
        
        return result;
    }
    static String usingSubString(String a) {
        if(a.isEmpty()) return "";
        char c = a.charAt(0);
        if(c == 'a') return usingSubString(a.substring(1));
        else return c+usingSubString(a.substring(1));
    }
    
    public static void main(String[] args) {
        
        String a = "ghshgahaaa";
        StringBuilder result =new StringBuilder();
        System.out.println(resultString(a,0,result));
        System.out.println(usingSubString(a));
    }
}
