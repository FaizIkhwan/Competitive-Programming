import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        int r = input.nextInt();
        boolean inRadius = false;

        for(int i=0; i<t; i++) {

            int xInp = input.nextInt();
            int yInp = input.nextInt();

            double distance = Math.sqrt( Math.pow((xInp - x), 2) + Math.pow((yInp - y), 2) );

            if (distance <= r) {
                inRadius = true;
            }
        }

        if (inRadius) {
            System.out.println("ALERT");
        }
    }
}
