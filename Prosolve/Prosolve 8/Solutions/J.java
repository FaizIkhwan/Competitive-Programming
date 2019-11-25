import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int FINAL_ANS = 6174;

        for(int i=0; i<t; i++) {
            // user input
            int num = input.nextInt();
            int count = 1;

            while(num != FINAL_ANS) {
                String numString = num + "";
                char[] nums = numString.toCharArray();
                int indexDescending = 3;

                // Create ascending
                Arrays.sort(nums);
                char[] ascendingNum = nums;
                char[] descendingNum = new char[ascendingNum.length];
                int indexAscendingNum = ascendingNum.length;

                String desc ="";
                String asc ="";
                // Create descending
                for(int j=0; j<indexAscendingNum; j++) {
                    desc = desc + ascendingNum[indexDescending--] + "";
                    asc = asc + ascendingNum[j] + "";
                }

                // string to int
                int larger = Integer.parseInt(desc);
                int smaller = Integer.parseInt(asc);

                // Descending - ascending
                num = larger - smaller;
                count++;
            }

            System.out.println(count);

        }
    }
}
