
import java.util.Arrays;
import java.util.Scanner;

/**
 * Easy, ad hoc, 20 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve2E 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            String inp1 = input.next();
            String inp2 = input.next();
            
            if(inp1.length() != inp2.length())
            {
                System.out.println("Case "+(i+1)+": No");
                continue;
            }
            else
            {
                //Sorting
                char char1[] = inp1.toCharArray();
                char char2[] = inp2.toCharArray();
                Arrays.sort(char1);
                Arrays.sort(char2);
                boolean state = false;
                
                for(int j=0; j<char1.length; j++)
                {
                    if(char1[j] == char2[j])
                    {
                        state = true;                        
                    }
                    else
                    {
                        state = false;
                        break;
                    }
                }
                
                if(state) // is same
                    System.out.println("Case "+(i+1)+": Yes");
                else // Not same
                    System.out.println("Case "+(i+1)+": No");
            }
        }
    }
}
