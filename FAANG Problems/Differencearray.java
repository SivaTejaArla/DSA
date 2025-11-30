import java.util.Arrays;

public class Differencearray {

    public int[] differArray(int[] a, int[] q) {
        int[] dif = new int[a.length];
        dif[0] = a[0];
        for (int i = 1; i < a.length; i++)
            dif[i] = a[i] - a[i - 1];
        System.out.println("Difference Array : " + Arrays.toString(dif));
        dif[q[0]] += q[2];

        if (q[1] + 1 < dif.length)
            dif[q[1] + 1] -= q[2];

        int sum = dif[0];
        a[0] = dif[0];
        for (int i = 1; i < a.length; i++) {
            sum += dif[i];
            a[i] = sum;
        }
        return a;
    }

    public static void main(String[] args) {
        Differencearray d = new Differencearray();

        int[] a = { 2, 4, 5, 3, 7, 1, 4 };
        System.out.println("Initial Array :" + Arrays.toString(a));
        int[] q = { 0, 4, 2 };
        System.out.println("Query Array :" + Arrays.toString(q));

        int[] res = d.differArray(a, q);
        System.out.println("Resultant Array :" + Arrays.toString(res));

    }
}
