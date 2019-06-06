import java.util.Scanner;
import java.util.Stack;

public class B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String inp;
        String res = "";
        Stack<Character> stack = new Stack<Character>();

        inp = input.next();

        for(int i=0 ; i<inp.length(); i++)
        {
            if(Character.isLetter(inp.charAt(i)))
                stack.push(inp.charAt(i));
        }

        while(!stack.empty())
        {
            res += stack.pop();
        }

        System.out.println(res);
    }
}
