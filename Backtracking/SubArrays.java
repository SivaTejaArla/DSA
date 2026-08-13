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
