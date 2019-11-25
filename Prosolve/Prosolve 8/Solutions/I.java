import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i=0; i<t; i++) {
            int num = input.nextInt();
            int res = num/2*4-2;
            int mod = num % 2;
            int finalRes = res + mod;

            // conv
            System.out.println((finalRes/24) + "d" + (finalRes%24) + "h");
        }
    }
}
