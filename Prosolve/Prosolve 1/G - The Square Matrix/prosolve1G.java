
import java.util.Scanner;

/**
 *
 * @author Faiz Ikhwan
 */
public class prosolve1G 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int inp = input.nextInt();
            
            for(int column=0; column<inp; column++)
            {
                for(int row=0; row<inp; row++)
                {
                    if( column == row || (column+row+1)==inp )
                        System.out.print("0");
                    else
                        System.out.print("1");
                }
                System.out.println();
            }
        }
    }
}
