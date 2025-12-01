/*                  p     up             p = processed String       up = unProcessed String 
                    "" , "abc"
                  /            \
            "a","bc"          "" ,"bc"
           /       \          /       \
     "ab","c"   "a","c"   "b","c"    "" ,"c"
      /   \      /   \     /   \      /   \
 "abc","" "ab","" "ac","" "a","" "bc","" "b","" "c","" "" ,""

*/
import java.util.*;

class Main {
    
   
static void printSubSeq(String p, String up){
    if(up.isEmpty()) {
        System.out.println(p); // print the character on reaching the end of function call 
      return; 
    }
    char ch = up.charAt(0); 
    
    printSubSeq(p+ch, up.substring(1)); // take the next character
     printSubSeq(p, up.substring(1)); // ignore next character
    
}
    public static void main(String[] args) {
        
        printSubSeq("","abc");
    
    }
}
