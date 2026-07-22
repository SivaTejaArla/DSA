package SearchingAlgorithms;

public class LinearSearch {

//In this algorithm we will search each element of the array 

    static boolean foundElement(int[] a, int target, int index) {

        if (a.length == 0)
            return false;
        if (index == a.length - 1)
            return false;
        if (a[index] == target)
            return true;
        else
            return foundElement(a, target, index + 1);
    }

    static boolean foundElementLoop(int[] a,int target){

        for(int i =0 ; i< a.length-1 ; i++){
            if(a[i] == target) return true ;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 3, 6, 8, 9, 11, 32, 21 };

        System.out.println(foundElement(a, 19, 0));
                System.out.println(foundElementLoop(a, 9));

    }
}
