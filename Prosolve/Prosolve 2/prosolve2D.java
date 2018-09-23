
import java.util.Scanner;

/**
 * Easy, ad hoc, 20 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve2D 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int inp = input.nextInt();
            
            if(inp%4 == 0)
            {
                if(inp%100 == 0)
                {
                    if(inp%400 == 0)                    
                        System.out.println("Case "+(i+1)+": Yes");                    
                }
                else
                    System.out.println("Case "+(i+1)+": Yes");
            }
            else
                System.out.println("Case "+(i+1)+": No");
        }
    }
}
