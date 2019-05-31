
import java.math.BigInteger;
import java.util.Scanner;

public class H
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int userInput;
        String temp;
        int count;

        for(int i=0; i<t; i++)
        {
            userInput = input.nextInt();
            temp = String.valueOf(factorial(userInput));
            count = 0;

            for(int j=temp.length()-1; j>=0; j--)
            {
                if(temp.charAt(j) == '0')
                    count++;
                else
                    break;
            }
            System.out.println("Case " + (i+1) + ": " + count);
        }
    }

    static BigInteger factorial(int n)
    {
        long i;
        BigInteger res = BigInteger.ONE;
        for (i=2; i<=n; i++)
        {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

}
