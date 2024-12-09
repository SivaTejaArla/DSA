package SortingAlgorithms;

/*
 -> Push the largest element to end of list 
 -> Compare adjacent elements and swap 

7   8   3   1   2      
7   3   1   2   8
3   1   2   7   8
1   2   3   7   8

OUTER LOOP

7   8   3   1   2
 7  3   8   1   2
 7  3   1   8   2
 7  3   1   2   8

 INNER LOOP

 */


import java.util.Arrays;
public class Bubblesort{
    
    public void printArray(int[] a){        //Printingarray

        System.out.println();
       System.out.println(Arrays.toString(a));
    }
    public void bubbleSort(int[] a){
        int n = a.length-1;
        for(int i =0 ;i<n;i++){
            for(int j =0;j<n;j++)
            {
                if(a[j]>a[j+1]){            //Swapping without temp
                    a[j] +=a[j+1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                }
            }
        }
    }
    public static void main(String[] args) {
        Bubblesort b = new Bubblesort();
        int[] a = {1,7,5,9,3,2,11,67,34 };
        b.printArray(a);
        b.bubbleSort(a);
        b.printArray(a);


    }
    
}