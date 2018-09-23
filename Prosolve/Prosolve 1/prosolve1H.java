
import java.util.Scanner;

/**
 * Easy, ad hoc, 18 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve1H 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            String inp = input.next();
            
            if(inp.length()<10)
                System.out.println(inp);
            else
            {                
                System.out.print(inp.charAt(0));
                System.out.print(inp.length()-2);
                System.out.print(inp.charAt(inp.length()-1));
                System.out.println();               
            }
        }
    }
}
