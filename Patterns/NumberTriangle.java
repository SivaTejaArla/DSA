public class NumberTriangle {

    static void main(String[] args) {

        int n = 4;
        int counter = 0;
        for(int i =0 ; i< n ;i++)
        {
            counter++;
            for(int k = 0 ; k<2*n-1;k++){

                if(k==n-1) {
                    System.out.print(counter);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
