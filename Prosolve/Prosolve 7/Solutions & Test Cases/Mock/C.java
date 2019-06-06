import java.util.Scanner;

public class C
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for(int i=1; i<=num2; i++)
        {
            System.out.println(num1 + " x " + i + " = " + (num1*i));
        }
    }
}
