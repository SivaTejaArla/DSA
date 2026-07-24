/*
Approach: Backtracking

Backtracking explores all possible choices by:

Adding the current subset to the result.
Iterating through the remaining elements.
Choosing an element and adding it to the current subset.
Recursively generating further subsets.
Removing the last added element (backtrack) to explore other possibilities.

Input: [1, 2, 3]

Output:
[]
[1]
[1, 2]
[1, 2, 3]
[1, 3]
[2]
[2, 3]
[3]

*/


package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubArrays {


   static List<List<Integer>> result =new ArrayList<>();

   static void findSubarrays(int []a, int index, List<Integer> currentList){

        result.add(new ArrayList<>(currentList));

        for(int i=index; i< a.length;i++){
          currentList.add(a[i]);
          findSubarrays(a, i+1, currentList);
          currentList.remove(currentList.size()-1);
        }


    }

    public static void main(String[] args) {
        
        int []a = {1,2,3,7,4};

findSubarrays(a,0,new ArrayList<>());

System.out.println(result);

    }

}
