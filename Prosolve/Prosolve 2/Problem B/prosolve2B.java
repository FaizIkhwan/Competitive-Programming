
import java.util.Scanner;

/**
 *
 * @author Faiz Ikhwan
 */
public class prosolve2B 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int countVowel = 0, countConsonent = 0;
            
            String inp = input.next();
            for(int j=0; j<inp.length(); j++)
            {
               if( inp.charAt(j)=='A' || inp.charAt(j)=='a' || inp.charAt(j)=='E' || inp.charAt(j)=='e' || inp.charAt(j)=='I' || inp.charAt(j)=='i' || inp.charAt(j)=='O' || inp.charAt(j)=='o' || inp.charAt(j)=='U' || inp.charAt(j)=='u')
                   countVowel++;
               else
                   countConsonent++;
            }
            
            System.out.println("Case "+(i+1)+": "+countVowel+" "+countConsonent);
        }
    }
}
