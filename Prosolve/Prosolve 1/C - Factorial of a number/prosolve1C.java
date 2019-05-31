
import java.util.Scanner;

/**
 * Easy, recursive, 4 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve1C 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int inp = input.nextInt();
            System.out.println(factorial(inp));
        }                
    }
    
    static int factorial(int num)
    {
        if(num == 0)
            return 1;
        else
            return(num * factorial(num-1));
    }
}
