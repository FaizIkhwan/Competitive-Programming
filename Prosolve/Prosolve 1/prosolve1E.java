
import java.util.Scanner;

/**
 * Easy, ad hoc, 4 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve1E 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int numStudent = input.nextInt();
            int venue = input.nextInt();
            int food = input.nextInt();
            int transport = input.nextInt();
            int other = input.nextInt();
            
            int totalBudget = venue + food + transport + other;
            
            if(numStudent>=1 && numStudent<=20)
            {
                if(totalBudget<=2000)
                    System.out.println("APPROVED");
                else
                    System.out.println("DENIED");
            }
            else if(numStudent>=21 && numStudent<=50)
            {
                if(totalBudget<=4000)
                    System.out.println("APPROVED");
                else
                    System.out.println("DENIED");
            }
            else if(numStudent>50)
            {
                if(totalBudget<=10000)
                    System.out.println("APPROVED");
                else
                    System.out.println("DENIED");
            }
        }
    }
}
