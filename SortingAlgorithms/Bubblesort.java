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

| Pass  | List at Start of Pass | Comparisons                | Swaps             | List After Pass     |
| ----- | --------------------- | -------------------------- | ----------------- | ------------------- |
| **1** | [7, 8, 3, 1, 2]       | (7,8), (8,3), (8,1), (8,2) | No, Yes, Yes, Yes | **[7, 3, 1, 2, 8]** |
| **2** | [7, 3, 1, 2, 8]       | (7,3), (7,1), (7,2), (7,8) | Yes, Yes, Yes, No | **[3, 1, 2, 7, 8]** |
| **3** | [3, 1, 2, 7, 8]       | (3,1), (3,2), (3,7)        | Yes, Yes, No      | **[1, 2, 3, 7, 8]** |
| **4** | [1, 2, 3, 7, 8]       | (1,2), (2,3)               | No, No            | **[1, 2, 3, 7, 8]** |
| **5** | [1, 2, 3, 7, 8]       | (Only 1 element left)      | No                | **[1, 2, 3, 7, 8]** |

 */

import java.util.Arrays;

public class Bubblesort {

    public void printArray(int[] a) { // Printingarray

        System.out.println();
        System.out.println(Arrays.toString(a));
    }

    public void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) { // Swapping without temp
                    a[j] += a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }
    }

    public void bubbleSortRecursion(int[] a, int n) {

        if (n == 1)     // which means we are at the last loop or at last element
            return;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                a[i] += a[i + 1];
                a[i + 1] = a[i] - a[i + 1];
                a[i] = a[i] - a[i + 1];
            }
        }
        bubbleSortRecursion(a, n - 1);

    }

    public static void main(String[] args) {
        Bubblesort b = new Bubblesort();
        int[] a = { 1, 7, 5, 9, 3, 2, 11, 67, 34 };
        int[] aa = { 1, 7, 5, 9, 3, 2, 11, 67, 34 };

        b.printArray(a);
        b.bubbleSort(a);
        b.printArray(a);
        b.bubbleSortRecursion(aa, aa.length);
        b.printArray(aa);

    }

}
