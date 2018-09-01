
import java.util.Scanner;

/**
 * AC, easy, ad hoc, 30 August 2018.
 * @author Faiz Ikhwan
 */
public class p12289 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            String inp = input.next();
            
            if( inp.length() == 5)
            {
                System.out.println("3");
                continue;
            }
            
            // to check if it is "one" or "two"
            int countOne = 0, countTwo = 0;
            for(int j=0; j<3; j++)
            {
                if(inp.charAt(j) == 'o' || inp.charAt(j) == 'n' || inp.charAt(j) == 'e')
                    countOne++;
                if(inp.charAt(j) == 't' || inp.charAt(j) == 'w' || inp.charAt(j) == 'o')
                    countTwo++;                                
            }            
            if(Math.max(countOne, countTwo) == countOne) // Check which one is more likely the answer
                System.out.println("1");
            else
                System.out.println("2");            
        }
    }
}
