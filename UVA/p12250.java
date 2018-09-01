
import java.util.Scanner;

/**
 * AC, easy, ad hoc, 29 August 2018.
 * @author Faiz Ikhwan
 */
public class p12250 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        while(true)
        {
            String inp = input.next();
            
            if(inp.equals("#"))
                break;
            else
            {
                if(inp.equals("HELLO"))
                    System.out.println("Case "+(counter)+": ENGLISH");
                else if(inp.equals("HOLA"))
                    System.out.println("Case "+(counter)+": SPANISH");
                else if(inp.equals("HALLO"))
                    System.out.println("Case "+(counter)+": GERMAN");
                else if(inp.equals("BONJOUR"))
                    System.out.println("Case "+(counter)+": FRENCH");
                else if(inp.equals("CIAO"))
                    System.out.println("Case "+(counter)+": ITALIAN");
                else if(inp.equals("ZDRAVSTVUJTE"))
                    System.out.println("Case "+(counter)+": RUSSIAN");
                else
                    System.out.println("Case "+(counter)+": UNKNOWN");                
                
                counter++;
            }
        }
    }
}
