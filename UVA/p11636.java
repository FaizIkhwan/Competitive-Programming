
import java.util.Scanner;

/**
 * AC, easy, ad hoc, 30 August 2018.
 * @author Faiz Ikhwan
 */
public class p11636 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        
        while(true)
        {
            int inp = input.nextInt();
            int i = 2;
            int res = 0;
            int remainder = 0;
            
            if(inp<0)
                break;
            else if(inp == 1 || inp == 0)
                System.out.println("Case "+counter+": 0");
            else
            {
                while(i < inp)
                {
                    res++;
                    i *= 2;
                }
                remainder = inp - i/2;
                if(remainder<i && remainder != 0)
                    res++;
                System.out.println("Case "+counter+": "+res);
            }                       
            
            counter++;
        }
    }
}
