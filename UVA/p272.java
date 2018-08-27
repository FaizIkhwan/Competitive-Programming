
import java.util.Scanner;

/**
 * AC, easy, ad hoc, 26 August 2018.
 * @author Faiz Ikhwan
 */

public class p272 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inp, res;
        boolean state = true;
        
        while(input.hasNextLine())
        {
            inp = input.nextLine();
            res = "";
            
            for(int i=0; i<inp.length(); i++)
            {                            
                if(inp.charAt(i) == '\u001a')  // EOF Character  
                    break;  
                
                if(inp.charAt(i) == '\"') // "
                {
                    if(state)
                        res += "``";
                    else
                        res += "''";
                        
                    state = !state;                  
                }                       
                else
                    res += inp.charAt(i);
            }
            
            System.out.println(res);
            
        }
    }
}
