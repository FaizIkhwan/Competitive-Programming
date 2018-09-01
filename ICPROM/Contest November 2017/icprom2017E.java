
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Easy sikit, ad hoc, 31 August 2018.
 * @author Faiz Ikhwan
 */
public class icprom2017E 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++)
        {
            String inp = br.readLine();
            String[] data = inp.split(",");
            boolean ap = false, gp = false;
            
            for(int j=0; j<data.length-2; j++) // Checking AP
            {
                if(Double.parseDouble(data[j+1]) - Double.parseDouble(data[j]) == Double.parseDouble(data[j+2]) - Double.parseDouble(data[j+1]))
                    ap = true;
                else
                {
                    ap = false;                                
                    break;
                }                    
            }
            
            for(int j=0; j<data.length-2; j++) // Checking GP
            {
                if(Double.parseDouble(data[j+1]) / Double.parseDouble(data[j]) == Double.parseDouble(data[j+2]) / Double.parseDouble(data[j+1]))
                    gp = true;
                else
                {
                    gp = false;
                    break;
                }                    
            }          
            
            if(ap == true)
                System.out.println("Arithmetic Sequence");
            else if(gp == true)
                System.out.println("Geometric Sequence");
            else if(ap == false && gp == false)
                System.out.println("Invalid Sequence");
        }
    }
}
