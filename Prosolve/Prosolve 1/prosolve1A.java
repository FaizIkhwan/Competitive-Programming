
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Easy, ad hoc, 4 September 2018.
 * @author Faiz Ikhwan
 */
public class prosolve1A 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++)
        {
            String inp = br.readLine();
            String[] data = inp.split(" ");
            
            for(int j=0; j<data.length-1; j++)
            {
                for(int k=0; k<data[j].length(); k++)                
                    System.out.print("*");
                
                System.out.println();
            }
            System.out.println();
        }
    }
}
