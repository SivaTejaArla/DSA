package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {


       public void printArray(int[] a){        //Printingarray

        System.out.println();
       System.out.println(Arrays.toString(a));
    }

    public void insertionSort(int[] a ){
        int n = a.length;
        int curr,prev;

        for(int i = 1;i<n;i++ ){

            curr = a[i];
             prev = i-1;
             while(prev >=0 && a[prev] > curr ){
                a[prev+1] = a[prev];
                prev--;
             }
             a[prev+1] = curr;  // Placing curr element at correct position
        }

    }
    public static void main(String[] args) {
        InsertionSort in = new InsertionSort();
        int[] a = {1,7,5,9,3,2,11,67,34 };
        in.printArray(a);
        in.insertionSort(a);
        in.printArray(a);
        
    }
    
}
