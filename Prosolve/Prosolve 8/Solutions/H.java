import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int i=0; i<t; i++) {
            String inp = input.next();
            char currentChar = inp.charAt(i);
            List<Character> foundedChar = new ArrayList<>();
            boolean hasFound = false;

            for(int j=0; j<inp.length(); j++) {
                if(foundedChar.contains(inp.charAt(j))) {
                    System.out.println(inp.charAt(j));
                    hasFound = true;
                    break;
                }
                foundedChar.add(inp.charAt(j));
            }

            if (hasFound == false) {
                System.out.println("None");
            }
        }
    }
}
