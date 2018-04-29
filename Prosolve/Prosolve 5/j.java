
import java.util.Scanner;

class GFG 
{
    // m is size of coins array 
    // (number of different coins)
    static int minCoins(int coins[], int m, int V)
    {
        // table[i] will be storing 
        // the minimum number of coins
        // required for i value. So 
        // table[V] will have result
        int table[] = new int[V + 1];
 
        // Base case (If given value V is 0)
        table[0] = 0;
 
        // Initialize all table values as Infinite
        for (int i = 1; i <= V; i++)
        table[i] = Integer.MAX_VALUE;
 
        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= V; i++)
        {
            // Go through all coins smaller than i
            for (int j = 0; j < m; j++)
            if (coins[j] <= i)
            {
                int sub_res = table[i - coins[j]];
                if (sub_res != Integer.MAX_VALUE 
                       && sub_res + 1 < table[i])
                       table[i] = sub_res + 1;
                        
                 
            }
             
        }
        return table[V];
         
    }
 
    // Driver program 
    public static void main (String[] args) 
    {
        

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] coins = new int[m];
        for (int i =0; i<m; i++)
        {
            coins[i] = input.nextInt();
        }
        System.out.println (minCoins(coins, m, n));
    }
}
 