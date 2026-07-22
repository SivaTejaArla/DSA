/*

To convert Arrays to List 


== First need to convert primitive data type(int) to Integer 

.stream() method will capture will capture all array elements as a stream 
.boxed() method will convert each element to Integer 


if it's like 


Integer a[] = {1,2,3,4,5,6}; 
then
List<Integer> c = Arrays.asList(a);



asList() and toList() are different methods


*/

import java.lang.reflect.Array;
import java.util.*;

public class ArrayToList {





    public static void main(String[] args) {

        int []a = {1,2,3,4,5,6,7,8};

        List<Integer> z = Arrays.stream(a).boxed().toList();
        System.out.println("Max number is " + Collections.max(z));
        
    }
}
