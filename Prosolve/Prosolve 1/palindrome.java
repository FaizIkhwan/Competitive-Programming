import java.util.Scanner;
// BELUM SIAP
public class palindrome {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {        
        int t = input.nextInt();
        for (int i = 0; i < t; i++) 
        {
            String str1 = input.next();                     
            String afterStr1 = "";
            String pOrNot = "None";
            int count = 0;
            boolean check = false;
            boolean ifDone = false;
            for(int j=0; j<10; j++)
            {                                
                afterStr1 = reverseAndAdd(str1);
                ifDone = checkIfPalindrome(afterStr1);
                if(ifDone == true)
                    check = true;
                else
                    str1 = reverseAndAdd(afterStr1);
                count++;
                if(check == true)                                   
                    break;                
            }                        
            if(check)                
                System.out.println(afterStr1+";"+"Palindrome"+";"+count);
            else
                System.out.println(afterStr1+";"+"None");
        }
    }
    
    //reverse the string add the original with reversed string
    static public String reverseAndAdd(String str1) 
    {        
        String str2 = new StringBuffer(str1).reverse().toString();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int total = num1 + num2;
        String totalInString = String.valueOf(total);
        return totalInString;
    }
    
    static public boolean checkIfPalindrome(String str1)
    {
        String str2 = new StringBuffer(str1).reverse().toString();
        if(str2.equals(str1))
            return true;
        else
            return false;
    }
}
