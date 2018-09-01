
import java.util.Scanner;

/**
 * Easy, ad hoc, 31 August 2018.
 * @author Faiz Ikhwan
 */
public class icpromMockB 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i=0; i<t; i++)
        {
            String alphabet = input.next();
            int row = input.nextInt();
            int column = input.nextInt();
            
            for(int j=0; j<column; j++)
            {
                System.out.print(alphabet);
                
                for(int k=0; k<(row-2); k++)
                {
                    if(j == 0 || j == (column-1) )
                        System.out.print(alphabet);
                    else
                        System.out.print(" ");
                }
                
                System.out.print(alphabet);
                System.out.println();
            }
        }
    }    
}
