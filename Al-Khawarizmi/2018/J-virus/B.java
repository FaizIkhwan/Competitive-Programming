// not my code
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;

public class B{

    public static int count = 0;

    public static void main(String[] args) throws Exception{
        ArrayList<BigInteger> memoized = new ArrayList<BigInteger>();

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		while(data != -1){

			fibonanci(data, memoized);

			System.out.println("Hour " + data + ": " + memoized.get(data) + " cow(s) affected");

			data = sc.nextInt();
		}
    }

    private static BigInteger fibonanci(int n, ArrayList<BigInteger> memoized) {
        BigInteger febonani = BigInteger.ZERO;
        int size = memoized.size();
        if (n < 0) {
            return BigInteger.ZERO;
        }
        if (size > n) {
                febonani = memoized.get(n);
        } else {
            for(int i = size; i <= n; i++) {
                if(i == 0) {
                    febonani = BigInteger.ZERO;
                } else if(i == 1 || i == 2) {
                    febonani = BigInteger.ONE;
                } else {
                    febonani = memoized.get(i - 1).add(memoized.get(i - 2));
                }
                memoized.add(febonani);
            }
        }
        return febonani;
    }
}