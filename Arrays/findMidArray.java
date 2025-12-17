/*
Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

    myArray = [1, 2, 3, 4]
    middle(myArray)  # [2,3]. 
    
    Arrays.copyOfRange(array,startIndexToBeIncluded,lastIndexToBeIncluded)
*/



import java.util.Arrays;
public class findMidArray {
    public static int[] middle(int[] array) {
        if(array.length <3 ) return new int[0]; 
        return Arrays.copyOfRange(array,1,array.length-1);
    }
public static void main(String []args){
    int a []= {1,2,3,4,5,6,7,8,9}; 
   System.out.println(a.length);
    System.out.println( Arrays.toString(middle(a)));
}
}
