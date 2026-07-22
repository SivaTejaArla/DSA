package SortingAlgorithms;

/*
Selection sort works by shifting largest element to the last of the array or smallest to first of array,
some what similar to bubble sort
++ Let first index as  min Index
++ Compare with adjacent element(j) or (i+1) if it is min then  min_index = j
++ Swap arr[i] and arr[min_index] 

| Loop (i) | Unsorted Part        | Smallest Found | Swap Performed | Result After Loop        |
| -------- | -------------------- | -------------- | -------------- | ------------------------ |
| **0**    | [29, 10, 14, 37, 14] | 10             | Swap 29 ↔ 10   | **[10, 29, 14, 37, 14]** |
| **1**    | [29, 14, 37, 14]     | 14             | Swap 29 ↔ 14   | **[10, 14, 29, 37, 14]** |
| **2**    | [29, 37, 14]         | 14             | Swap 29 ↔ 14   | **[10, 14, 14, 37, 29]** |
| **3**    | [37, 29]             | 29             | Swap 37 ↔ 29   | **[10, 14, 14, 29, 37]** |
| **4**    | [37]                 | 37             | No swap        | **[10, 14, 14, 29, 37]** |



*/
public class SelectionSort {
    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }   
}
