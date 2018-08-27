
import java.util.Scanner;


/**
 * AC, easy, ad hoc, 26 August 2018.
 * @author Faiz Ikhwan
 */
public class p11172 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();       
        
        for(int i=0; i<t; i++)
        {
            int x = input.nextInt();                     
            int y = input.nextInt();                     
                        
            if(x>y)
                System.out.println(">");
            else if(x<y)
                System.out.println("<");
            else if(x==y)
                System.out.println("=");
        }
    }
}
