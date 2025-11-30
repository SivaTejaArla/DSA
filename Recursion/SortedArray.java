package Recursion;

//In this problem we will check if an array is sorted using recursion.
public class SortedArray {

    static boolean isSortedBack(int a[], int i, int j) { // checking from back of array
        if (a.length == 0)
            return false;

        if (i < 0)
            return true;
        if (a[j] > a[i]) {
            return isSortedBack(a, i - 1, j - 1);
        } else
            return false;

    }

    static boolean isSortedFront(int []a, int i){ // checking from front 

        if(a.length == 0) return false; 
        if(i +1 > a.length-1) return true;
        if(a[i] < a[i+1]) return isSortedFront(a, i+1);
        else return false;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 14, 5 };
        System.out.println(isSortedBack(a, a.length - 2, a.length - 1));
         System.out.println(isSortedFront(a,0));
    }
}
