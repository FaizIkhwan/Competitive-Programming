import java.util.Scanner;

public class A
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] inp = new int[10];
        int total;

        // test case
        for(int i=0; i<t; i++)
        {
            total = 0;

            // input
            for(int j=0; j<inp.length; j++)
            {
                inp[j] = input.nextInt();
            }

            // process
            for(int j=0; j<inp.length; j++)
            {
                total += inp[j];
            }

            System.out.println(total + " " + (total/inp.length));
        }


    }
}
