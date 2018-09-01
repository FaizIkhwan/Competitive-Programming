
import java.util.Scanner;

/**
 * Very easy, ad hoc, 31 August 2018.
 * @author Faiz Ikhwan
 */
public class icprom2017D 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double avgSpeed = input.nextDouble();
        double time = input.nextDouble();
        
        double res = (avgSpeed*time) / 0.35;
        
        System.out.println((int) res);
    }
}
