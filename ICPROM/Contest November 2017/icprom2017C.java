
import java.util.Scanner;

/**
 * Easy, ad hoc, 31 August 2018.
 * @author Faiz Ikhwan
 */
public class icprom2017C 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            String inp = input.next();
            try
            {
                System.out.println(Integer.parseInt(inp,2));
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid Binary Number");
            }
        }
    }
}
