
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Easy, ad hoc, 1 September 2018.
 * @author Faiz Ikhwan
 */
public class icprom2017H 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String inp = input.next();                
        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();        
        
        for(int i=0; i<inp.length(); i++)
        {
            int numToTest = Integer.parseInt(inp.charAt(i)+"");
            if(numToTest % 2 == 0) // Even
                even.add(numToTest);
            else if(numToTest % 2 == 1) // Odd
                odd.add(numToTest);            
        }        
        
        // Displaying output ( even num first, odd 2nd)
        for(int i=0; i<even.size(); i++)
            System.out.print(even.get(i)+" ");
        
        System.out.println();
        
        for(int i=0; i<odd.size(); i++)
            System.out.print(odd.get(i)+" ");
    }
}
