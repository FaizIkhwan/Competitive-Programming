import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for(int i=0; i<t; i++) {
            try {
                Scanner input1 = new Scanner(System.in);
                String inp = "";
                if(input1.hasNextLine())
                    inp = input1.nextLine();
                String operator = "";

                if (inp.contains("+")) {
                    operator = "+";
                } else if (inp.contains("-")) {
                    operator = "-";
                } else if (inp.contains("*")) {
                    operator = "*";
                } else if (inp.contains("/")) {
                    operator = "/";
                } else { // Rule 3
                    System.out.println("INVALID");
                    continue;
                }

                // index operator
                int indexBefore = inp.indexOf(operator);
                int indexAfter = indexBefore + 1;

                // index first num
                int num1 = Integer.parseInt(inp.substring(0, indexBefore).trim());
                int num2 = Integer.parseInt(inp.substring(indexAfter).trim());

                // rule 1
                if((num1 < 0) || (num2 < 0)) {
                    System.out.println("INVALID");
                    continue;
                }
                if ((num1 >= 10) || num2 >= 10) {
                    System.out.println("INVALID");
                    continue;
                }

                switch (operator) {
                    case "+":
                        System.out.println(num1+num2);
                        break;
                    case "-":
                        System.out.println(num1-num2);
                        break;
                    case "*":
                        System.out.println(num1*num2);
                        break;
                    case "/":
                        System.out.println(num1/num2);
                        break;
                }

            } catch (NumberFormatException e) { // rule 4
                System.out.println("INVALID");
                continue;
            }
        }
    }
}
