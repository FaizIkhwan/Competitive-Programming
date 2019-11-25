import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int i=0; i<t; i++) {
            int inp = input.nextInt();
            int num = 0;

            for(int j=1; j<=inp; j++) {
                for(int k=0; k<j; k++) {
//                    System.out.print((k+j) + " ");
                    System.out.print(++num + " ");
                }
                System.out.println();
            }

            for(int j=inp; j>0; j--) {
                for(int k= j; k>0; k--) {
                    System.out.print(num-- + " ");
                }
                System.out.println();
            }



        }
    }
}
