
import java.util.Scanner;

/**
 * Easy, ad hoc math, 4 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve1F 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int[] data = new int[10];
            int sum = 0;
                        
            for(int j=0; j<10; j++)
            {
                // Adding data.
                data[j] = input.nextInt();
                
                // Sum up total.
                sum += data[j];
            }
            
            // Calculating mean.
            int mean = sum/10;
            
            // Display sum and mean.
            System.out.println(sum+" "+mean);                                        
        }
    }
}
