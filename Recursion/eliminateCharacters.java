/*
In this problem we need to eliminate the specific characters from the given string and return the output using Recursion.

*/
import java.util.*;

class Main {
    
    static StringBuilder resultString(String a, int n, StringBuilder result){
        if(a.length() == 0) return new StringBuilder("Invalid Input");  // Check for the valid input 
        if(n>=a.length()) return result;   //Return result after all the loops
        if(a.charAt(n) != 'a' && a.charAt(n) != 'A') result.append(a.charAt(n)); // Checking for both Lower Case and Upper case
        resultString(a,n+1,result);   // recursion call
        
        return result;
    }
    
    
    public static void main(String[] args) {
        
        String a = "";
        StringBuilder result =new StringBuilder();
        System.out.println(resultString(a,0,result));
    }
}
