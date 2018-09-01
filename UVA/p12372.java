
import java.util.Scanner;

/**
 * AC, easy, ad hoc, 30 August 2018.
 * @author Faiz Ikhwan
 */
public class p12372 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int L = input.nextInt();
            int W = input.nextInt();
            int H = input.nextInt();
            
            if(L<=20 && W<=20 && H<=20)
                System.out.println("Case "+(i+1)+": good");
            else
                System.out.println("Case "+(i+1)+": bad");
        }
    }
}
