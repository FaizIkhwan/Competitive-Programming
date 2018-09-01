
import java.util.Scanner;

/**
 * Very easy, ad hoc, 1 September 2018.
 * @author Faiz Ikhwan
 */
public class icprom2017J 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            int q, r;
            
            if(num1 > num2)
            {
                q = num1/num2;
                r = num1%num2;
            }
            else
            {
                q = num2/num1;
                r = num2%num1;
            }
            
            System.out.println("Q "+q+" R "+r);
        }
    }
}
