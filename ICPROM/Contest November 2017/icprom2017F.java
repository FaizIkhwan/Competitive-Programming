
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Easy maybe, data structure, 1 September 2018.
 * @author Faiz Ikhwan
 */
public class icprom2017F 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        // Input data
        for(int i=0; i<5; i++)        
            data.add(input.nextInt());
                     
        int inp = input.nextInt();
        
        // Transfering to temp array
        for(int i=0; i<inp; i++)        
            temp.add(data.get(i));                        
                
        // Removing element in data array
        for(int i=0; i<inp; i++)        
            data.remove(data.get(0));
        
        // Transfering back from temp to data
        for(int i=0; i<inp; i++)        
            data.add(temp.get(i));        
        
        // Displaying data
        for(int i=0; i<data.size(); i++)        
            System.out.print(data.get(i)+" ");
    }
}
