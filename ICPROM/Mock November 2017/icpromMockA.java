
import java.util.Scanner;

/**
 * Easy, ad hoc, 30 August 2018.
 * @author Faiz Ikhwan
 */
public class icpromMockA 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        System.out.println((int)Math.pow(num1, base));
        System.out.println((int)Math.pow(num2, base));
        System.out.println((int)Math.pow(num3, base));        
    }
}
