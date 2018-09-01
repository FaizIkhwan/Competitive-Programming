
import java.util.Scanner;

/**
 * AC, easy, ad hoc, 29 August 2018.
 * @author Faiz Ikhwan
 */
public class p11498 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int inp;
        
        while(true)
        {
            inp = input.nextInt();
            if(inp == 0)
                break;                        
            else
            {               
                int divX = input.nextInt();
                int divY = input.nextInt();
                
                for(int i=0; i<inp; i++)
                {
                    int x = input.nextInt();
                    int y = input.nextInt();
                    
                    if(x == divX || y == divY)
                        System.out.println("divisa");
                    else if(x > divX && y > divY)
                        System.out.println("NE");
                    else if(x > divX && y < divY)
                        System.out.println("SE");
                    else if(x < divX && y > divY)
                        System.out.println("NO");
                    else
                        System.out.println("SO");
                }
            }
        }
    }
}
