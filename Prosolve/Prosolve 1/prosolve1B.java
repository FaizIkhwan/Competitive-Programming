
import java.math.BigInteger;
import java.util.Scanner;


/**
 * Easy, math, ad hoc, 17 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve1B {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
       
        for(int i=0; i<t; i++)
        {
            BigInteger num1 = input.nextBigInteger();
            BigInteger num2 = input.nextBigInteger();
            System.out.println(num1.add(num2));
        }
    }
}
