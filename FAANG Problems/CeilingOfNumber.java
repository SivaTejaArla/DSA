import java.util.*;

class ceilingfOfNumber {

    public int findCeiling(int[] a, int target) {

        int start = 0;
        int end = a.length - 1;
        int c;

        while (start <= end) {

            int mid =start + (end - start) / 2;
            if (target < a[mid]) {

                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                return target;
            }

        }

        return a[start];
    }

    public static void main(String[] args) {
        int a[] = { 2,3,5,9,14,16,18 };
        ceilingfOfNumber cl = new ceilingfOfNumber();
        int target = 15;
        int r = cl.findCeiling(a, target);
        System.out.println(r);

    }
}