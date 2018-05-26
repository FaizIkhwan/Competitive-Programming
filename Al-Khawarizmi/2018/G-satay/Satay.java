// not my code
import java.util.Scanner;
import java.text.DecimalFormat;

public class Satay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// number of data
  		int NumDays = sc.nextInt();

  		// price raw ingredients
        double harga_spices = 8.0;
        double harga_chicken = 7.5;
        double harga_beef = 24;
        double harga_lamb = 32;
     
        // price satay per stick

        int cases = 1;
 
		DecimalFormat f2 = new DecimalFormat("0.00");

        while (NumDays != 0){
            int total_chickensold = 0;
            int total_beefsold = 0;
            int total_lambsold = 0;
            int total_nasi_impitsold = 0;
            
            for(int i = 0; i < NumDays; i++) {
        	
        		// read number of satay sold per day
        		int chickensold = sc.nextInt();
        		int beefsold = sc.nextInt();
        		int lambsold = sc.nextInt();
        		int nasi_impitsold = sc.nextInt();
        		
                total_chickensold += chickensold;
                total_beefsold += beefsold;
                total_lambsold += lambsold;
                total_nasi_impitsold += nasi_impitsold;
        		
            
            }
        	
            double gross_profit = (total_chickensold * 0.80) +
           						(total_beefsold * 1.00) +
           						(total_lambsold * 1.20) +
           						(total_nasi_impitsold * 0.80);
           	
            double cost_satay = (total_chickensold * harga_chicken/85.0) +
           							(total_beefsold * harga_beef/85.0) +
           							(total_lambsold * harga_lamb/85.0);
 
        	double cost_spices = (total_chickensold + total_beefsold + total_lambsold)/85.0 * 8.0;

        	double cost_nasimpit = total_nasi_impitsold * 0.2;
        		
           	double total_cost = cost_satay + cost_spices + cost_nasimpit;
        	double net_profit = gross_profit - total_cost;
        		
        	System.out.println("Case #" + (cases++) + ": RM" + f2.format(net_profit));
  			NumDays = sc.nextInt();
        }
    }
}
