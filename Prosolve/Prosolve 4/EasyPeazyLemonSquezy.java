/*
	A - starting point, B - End(inclusive, C - increment
*/
package prosolve;

import java.util.Scanner;

/**
 *
 * @author Faiz Ikhwan
 */
public class EasyPeazyLemonSquezy {
    public static void main(String[] args)
    {
        int tc;
        System.out.println("Enter test case: ");
        Scanner input = new Scanner(System.in);
        tc = input.nextInt();
        for(int i=0; i<tc; i++)
        {
            System.out.println("A: ");
            int a = input.nextInt();
            System.out.println("B: ");
            int b = input.nextInt();
            System.out.println("S: ");
            int s = input.nextInt();
            do
            {
                System.out.print(a+" ");
                a += s;   
                if(a>b)
                    break;
            }while(a<=b);
        }            
    }
}
