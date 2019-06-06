import java.text.DecimalFormat;
import java.util.Scanner;

public class D
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int t = input.nextInt();

        for(int i=0; i<t; i++)
        {
            double x = input.nextDouble();
            double y = input.nextDouble();
            double res = Math.pow(x, 2) + Math.sqrt(y);
            System.out.println("Case " + (i+1) + ": " + df.format(res));
        }


    }
}
