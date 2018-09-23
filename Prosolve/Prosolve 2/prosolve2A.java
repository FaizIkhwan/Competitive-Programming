
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Easy, ad hoc math, 10 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve2A {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            double x = input.nextDouble();
            double y = input.nextDouble();
            double res = Math.pow(x,2) + Math.sqrt(y);
            
            System.out.println("Case "+(i+1)+": "+df.format(res));
        }
    }
}
