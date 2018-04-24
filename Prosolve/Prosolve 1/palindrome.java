/*
    87 + 78 = 165
    165 + 561 = 726
    726 + 627 = 1353
    1353 + 3531 = 4884, a palindrome
    output : 4884;Palindrome;5
*/

import java.util.Scanner;
public class palindrome {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {        
        int t = input.nextInt();
        for (int i = 0; i < t; i++) 
        {
            String str1 = input.next();                     
            String afterStr1 = "";           
            boolean ifDone = false;
            int count = 1;
            for(int j=0; j<9;j++)
            {        
                count++;
                afterStr1 = reverseAndAdd(str1);
                ifDone = checkIfPalindrome(afterStr1);
                if(ifDone == true)                
                    break;                                    
                else
                    str1 = afterStr1;                                                                                   
            }                        
            if(ifDone)                
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
        return ""+total;
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
