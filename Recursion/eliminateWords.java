/* In this problem we are removing words from the given string using Recursion*/
import java.util.*;

class Main {
    
   
    static String eliminateWord(String a) {
        if(a.isEmpty()) return ""; 
        if(a.startsWith("apple")) return eliminateWord(a.substring(5));
        else return a.charAt(0) +eliminateWord(a.substring(1));
        
    }
    
    public static void main(String[] args) {
        
        String a = "ghshgahaappleap";
       
        System.out.println(eliminateWord(a));
    
    }
}
