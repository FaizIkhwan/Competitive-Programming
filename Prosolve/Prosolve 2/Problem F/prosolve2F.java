
import java.util.Arrays;
import java.util.Scanner;

/**
 * Easy, ad hoc, 20 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve2F 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int[] inp = new int[3];
            
            //input
            for(int j=0; j<3; j++)
                inp[j] = input.nextInt();
            
            //Sorting
            Arrays.sort(inp);
            
            System.out.println("Case "+(i+1)+": "+inp[1]);
        }
    }
}
