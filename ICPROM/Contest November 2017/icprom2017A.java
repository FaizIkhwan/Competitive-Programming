
import java.util.Scanner;

/**
 * Easy, ad hoc, 31 August 2018.
 * @author Faiz Ikhwan
 */
public class icprom2017A 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            double num1 = input.nextInt();
            double num2 = input.nextInt();
            double num3 = input.nextInt();
            double interval, res;
            
            if( (num2-num1) == (num3-num2) )
            {
                interval = num2-num1;
                res = num3 + interval;
            }                
            else
            {
                interval = num2/num1;                    
                res = num3 * interval;
            }
            
            System.out.println((int)res);         
        }
    }
}
