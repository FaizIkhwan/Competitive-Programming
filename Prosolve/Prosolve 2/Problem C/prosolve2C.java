
import java.util.Scanner;

/**
 * Easy, math, ad hoc, 20 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve2C 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int inp = input.nextInt();
            int res = 1;
            
            //calculating factorial
            for(int j=1; j<=inp; j++)            
                res *= j;
                
            System.out.println("Case "+(i+1)+": "+res);
        }
    }
}
