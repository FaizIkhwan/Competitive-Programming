import java.util.Scanner;

/*
*   Not so easy, ad hoc, 20 September 2018.
*/
public class prosolve1D
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int t = input.nextInt();
      int total = 0;
      
      for(int i=0; i<t; i++)
      {
         String inp = input.next();      
         boolean state = false;
         
         for(int j=1; j<=9; j++)
         {
            StringBuilder sb = new StringBuilder();                  
            // Reversing inp.
            sb.append(inp);
            sb.reverse();

            // Adding both.
            total = Integer.parseInt(inp) + Integer.parseInt(sb.toString());            

            if(isPalindrome(total)) // if it is palindrome
            {
                System.out.println(total+";Palindrome;"+(j+1));
                state = true;
                break;
            }         
            else
                inp = total+"";
         } 
         
         if(state == false)
             System.out.println(total+";None");
      }
   }
   
   static boolean isPalindrome(int num)
   {
       String inp = num+"";
       StringBuilder sb = new StringBuilder();
       // Reversing num.
       sb.append(inp);
       sb.reverse();
       
       return (inp.equals( sb.toString() ));
   }
}