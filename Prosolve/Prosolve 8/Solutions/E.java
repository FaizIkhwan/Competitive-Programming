import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int SIZE = 5;

        int t = input.nextInt();
        for (int i=0; i<t; i++) {
            int[] num = new int[SIZE];
            int res = 0;

            // input
            for (int k=0; k<num.length; k++) {
                num[k] = input.nextInt();
            }

            // BRUTE FORCE
            for(int j=0; j<num.length; j++) {

//                while() {
//
//                }
            }


            for (int k=0; k<num.length - 1; k++) {
                System.out.println("num[k]: " + num[k] + " num[k + 1]: " + num[k + 1]);
                res += (num[k] * num[k + 1]);
            }

            System.out.println(res);
        }
    }
}
