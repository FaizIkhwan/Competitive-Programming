import java.util.*;

class Triangle {

    public static void main(String [] args) {
        int n;
        int num;
        int sum ;
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        n = sc.nextInt();
        while (n != 0) {
            sum = 0;
            cnt++;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    num = sc.nextInt();
                    if ((i == 1) || (i == n))
                        sum = sum + num;
                    else if ((j == 1) || (j == i))
                        sum = sum + num;
                }
            }
            System.out.println( "Case " + cnt + ": " + sum );
            n = sc.nextInt();
        }
    }   
            
}
