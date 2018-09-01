
import java.util.Scanner;

/**
 * AC, easy, ad hoc, 30 August 2018.
 * @author Faiz Ikhwan
 */
public class p12577 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        
        while(true)
        {
            String inp = input.next();
            
            if(inp.equals("*"))
                break;
            else if(inp.equals("Hajj"))
                System.out.println("Case "+(counter)+": Hajj-e-Akbar");
            else if(inp.equals("Umrah"))
                System.out.println("Case "+(counter)+": Hajj-e-Asghar");
            
            counter++;
        }
    }
}
