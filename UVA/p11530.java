
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * AC, easy, ad hoc, 30 August 2018.
 * @author Faiz Ikhwan
 */
public class p11530 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int counter = 1;
        
        String[] str1 = {"a","d","g","j","m","p","t","w"," "};
        String[] str2 = {"b","e","h","k","n","q","u","x"};
        String[] str3 = {"c","f","i","l","o","r","v","y"};
        String[] str4 = {"s","z"};
        
        for(int i=0; i<t; i++)
        {
            String inp = br.readLine();
            int res = 0;                        
            
            for(int j=0; j<inp.length(); j++)
            {
                if(Arrays.asList(str1).contains(inp.charAt(j)+""))
                    res += 1;
                if(Arrays.asList(str2).contains(inp.charAt(j)+""))
                    res += 2;
                if(Arrays.asList(str3).contains(inp.charAt(j)+""))
                    res += 3;
                if(Arrays.asList(str4).contains(inp.charAt(j)+""))
                    res += 4;                
            }
            System.out.println("Case #"+counter+": "+res);
            counter++;
        }
    }
}
