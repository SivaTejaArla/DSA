
/*
✅ Merge Sort – Easy Bullet Points
🔹 Step 1: Split

    Take the list.

    Divide it into two halves.

    Keep splitting each half again.

    Stop when every piece has 1 element.

🔹 Step 2: Merge

    Start merging the small pieces back together.

    While merging, compare numbers and place them in sorted order.

    Merge small sorted pieces into bigger sorted pieces.

    Continue until the whole list is merged.

🔹 Final Result

    The fully merged list becomes sorted.
*/


import java.util.*;
class MergeSort {
    private static void merge(int [] a , int l , int mid , int r){
        int n1 = mid-l+1;      // m-l+1 is used because final_index - initial_index gives length 
        int n2 = r-mid;							// Similarly r - mid 
        int []leftArr = new int[n1] ;
        int rightArr[] = new int[n2];
        
        int i =0 ; 
        int j = 0 ;
         int k = l ; 
         
         for(int q =0 ; q < n1 ;q++){		// Copying the values to left Sub Array
             leftArr[q] = a[l+q];
         }
                  for(int q =0 ; q < n2 ;q++){ 		// Copying the values to right sub array
             rightArr[q] = a[mid+1+q];
         }
         
         while(i<n1 && j < n2){    // Adding values in sorted order to final array from left and right sub arrays 
             if(leftArr[i] <= rightArr[j]){
                 
                 a[k] = leftArr[i];
                 i++;
                 
             }else{
                 a[k] = rightArr[j];
                 j++;
             }
             k++;
             
         }
               while (i < n1) {   // Adding remaining values from left array
            a[k] = leftArr[i];
            i++;
            k++;
        }

         
        while (j < n2) {    // Adding remaining values from right array
            a[k] = rightArr[j];
            j++;
            k++;
        
    }
    }
    private static void mergeSort(int [] a , int l , int r){
        
     if (l < r) { 
            int mid = (l + r) / 2;   // Finding Mid
            mergeSort(a, l, mid);  // Dividing left sub array
            mergeSort(a, mid + 1, r); // Dividing right sub array
            merge(a, l, mid, r); // Merging arrays in sorted order
        }
        
        
    }
    
    private static void printArr(int [] a){
        for(int x : a ){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] a = {2,4,3,5,6,1,9,};
        System.out.println("Original ");
        printArr(a);
        mergeSort(a,0,a.length-1);
         System.out.println("Sorted");
        printArr(a);

        
    }
}
