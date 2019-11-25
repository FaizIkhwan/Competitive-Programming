import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i=0; i<t; i++) {
            Scanner input1 = new Scanner(System.in);
            String inp = "";
            if(input1.hasNextLine())
                inp = input1.nextLine();

            String[] chars = inp.split(" ");
            String res = "";
            boolean hasFound = false;

            for(int j=0; j<chars.length -1; j++) {
                if (chars[j].equals("Hello")) {
                    res += "olleH ";
                    //
                    String[] temp = chars[j+1].split("[ ><+-~!@#$%^&()?) ]");
                    chars[j+1] = temp[0] + "!" + temp[1];
                } else {
                    res += chars[j] + " ";
                }
            }


            System.out.println(res);

        }
    }
}
