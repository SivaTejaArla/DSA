package Recursion;

//In this problem we will check if an array is sorted using recursion.
public class SortedArray {

    static boolean isSorted(int a[], int i, int j) {
        if (a.length == 0)
            return false;

        if (i < 0)
            return true;
        if (a[j] > a[i]) {
            return isSorted(a, i - 1, j - 1);
        } else
            return false;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.print(isSorted(a, a.length - 2, a.length - 1));
    }
}
