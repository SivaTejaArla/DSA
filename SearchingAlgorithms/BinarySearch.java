package SearchingAlgorithms;

import java.util.Arrays;
public class BinarySearch {
    

static boolean search(int[] a , int target, int start, int end){

    if(start  > end) return false;
int mid = start + (end -start)/2;


   if(a[mid] == target) return true;
   else if(target > a[mid]) return search(a, target, mid+1, end);
   else return search(a, target, start, mid-1);


}


    public static void main(String args[]){
int[] a = { 2, 4, 3, 6, 8, 9, 11, 32, 21 };
Arrays.sort(a);

        System.out.println(search(a, 19, 0, a.length-1));
    }
}
