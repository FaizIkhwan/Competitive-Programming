
import java.util.Arrays;
import java.util.Scanner;

/**
 * AC, easy, ad hoc, 29 August 2018.
 * @author Faiz Ikhwan
 */
public class p11727 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            //Input user input into array.
            int[] inp = new int[3];            
            for(int j=0; j<3; j++)           
                inp[j] = input.nextInt();
            
            Arrays.sort(inp); // Sorting array
            
            System.out.println("Case "+(i+1)+": "+inp[1]); // Displaying result
        }
        
    }
}
