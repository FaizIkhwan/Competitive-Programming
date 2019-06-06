import java.text.DecimalFormat;
import java.util.Scanner;

public class A
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
        double x, y;
        double maxX = -1, maxY = -1;
        double max = Integer.MIN_VALUE;

        int t = input.nextInt();
        for(int a=0; a<t; a++)
        {
            int m = input.nextInt();

            for(double i=1; i<m; i += 0.1)
            {
                y = i;
                x = (m - y)/2;

                if((x*y) > max)
                {
                    max = (x*y);
                    maxX = x;
                    maxY = y;
                }
            }

            System.out.println(df.format(max) + " " + df.format(maxX) + " " + df.format(maxY));

        }
    }
}
