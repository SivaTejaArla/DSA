/*
Given a numeric string and a digit X, remove exactly one occurrence of X from the string such that the resulting number is as large as possible.

* Example:

* Input : number = "12331", digit = '3'
* Output : "1231"


Approach (Plain Text):
                
          // Iterate through the string.
          // For every occurrence of the target digit (w), create a new string by removing that occurrence.
          // Convert the resulting string into an integer.
          // Compare it with the current maximum value.
          // Keep updating the maximum value whenever a larger number is found.
          // After checking all occurrences, return the maximum number obtained.

          
*/

package Strings;

public class MaxValueAfterRemovingChar {

    public static void main(String[] args) {
        String q = "11231";
        char w = '1';
        int result = Integer.MIN_VALUE;

        for(int i=0;i<q.length();i++){
            if(q.charAt(i) == w){
                String data = q.substring(0,i)+q.substring(i+1);
                int val = Integer.parseInt(data);
                if(val > result) result=val;
            }
        }
        System.out.println(result);
    }

}
