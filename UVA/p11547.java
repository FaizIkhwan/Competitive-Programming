
import java.util.Scanner;

/**
 * AC, ad hoc, 29 August 2018.
 * @author Faiz Ikhwan
 */
public class p11547 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int inp = input.nextInt();
            String res = ""+((((((inp*567)/9)+7492)*235)/47)-498);
            System.out.println(res.charAt(res.length()-2));
        }
    }
}
