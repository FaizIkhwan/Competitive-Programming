
import java.util.Scanner;

/**
 * AC, easy, ad hoc, 30 August 2018.
 * @author Faiz Ikhwan
 */
public class p12403 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int res = 0;
        
        for(int i=0; i<t; i++)
        {
            String inp = input.next();
            if(inp.equals("report"))
                System.out.println(res);
            else if(inp.equals("donate"))
            {
                int inpNum = input.nextInt();
                res += inpNum;
            }
        }
    }
}
