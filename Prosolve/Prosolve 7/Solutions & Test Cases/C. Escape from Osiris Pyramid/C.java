import java.util.Scanner;

public class C
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String inp;
        int sum;

        for(int i=0; i<t; i++)
        {
            sum = 0;
            inp = input.next();

            for(int j=0; j<inp.length(); j++)
            {
                for(int k=0; k<inp.length(); k++)
                {
                    if(j != k)
                        sum += Integer.parseInt("" + inp.charAt(j) + inp.charAt(k));
                }
            }

            if(sum == Integer.parseInt(inp))
                System.out.println(sum + " is an Osiris number");
            else
                System.out.println(sum + " is not an Osiris number");
        }

    }
}
