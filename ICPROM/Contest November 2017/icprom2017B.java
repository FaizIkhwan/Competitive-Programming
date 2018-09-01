
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Easy, ad hoc, 31 August 2018.
 * @author Faiz Ikhwan
 */
public class icprom2017B 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++)
        {
            String inp = br.readLine();
            int vA = 0, va = 0;
            int vE = 0, ve = 0;
            int vI = 0, vi = 0;
            int vO = 0, vo = 0;
            int vU = 0, vu = 0;
            
            // Count how many vowels.
            for(int j=0; j<inp.length(); j++)
            {
                switch(inp.charAt(j))
                {
                    case 'A':
                        vA++;
                        break;
                    case 'a':
                        va++;
                        break;
                    case 'E':
                        vE++;
                        break;
                    case 'e':
                        ve++;
                        break;
                    case 'I':
                        vI++;
                        break;
                    case 'i':
                        vi++;
                        break;
                    case 'O':
                        vO++;
                        break;
                    case 'o':
                        vo++;
                        break;
                    case 'U':
                        vU++;
                        break;
                    case 'u':
                        vu++;
                        break;
                }                
            }                        
            // Print output.
            System.out.println(inp);
            if(va>0)
            {                
                for(int j=0; j<va; j++)
                    System.out.print("a");
                System.out.println();
            }
            if(vA>0)
            {
                for(int j=0; j<vA; j++)
                    System.out.print("A");
                System.out.println();
            }
            if(ve>0)
            {
                for(int j=0; j<ve; j++)
                    System.out.print("e");
                System.out.println();
            }
            if(vE>0)
            {
                for(int j=0; j<vE; j++)
                    System.out.print("E");
                System.out.println();
            }
            if(vi>0)
            {
                for(int j=0; j<vi; j++)
                    System.out.print("i");
                System.out.println();
            }
            if(vI>0)
            {
                for(int j=0; j<vI; j++)
                    System.out.print("I");
                System.out.println();
            }
            if(vo>0)
            {
                for(int j=0; j<vo; j++)
                    System.out.print("o");
                System.out.println();
            }
            if(vO>0)
            {
                for(int j=0; j<vO; j++)
                    System.out.print("O");
                System.out.println();
            }
            if(vu>0)
            {
                for(int j=0; j<vu; j++)
                    System.out.print("u");
                System.out.println();
            }
            if(vU>0)
            {
                for(int j=0; j<vU; j++)
                    System.out.print("U");            
                System.out.println();
            }
            System.out.println();
        }
    }
}
