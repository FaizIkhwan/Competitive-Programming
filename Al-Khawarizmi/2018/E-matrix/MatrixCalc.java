// not my code
import java.util.Scanner;

public class MatrixCalc {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);
  		int m = sc.nextInt();
  		int n = sc.nextInt();
  		int p = sc.nextInt();
  		int q = sc.nextInt();
  		int x = 1;

  		while ((m != 0)) { // || (n != 0) || (p != 0) || (q != 0)) {
  			System.out.println("Case #" + x + ":");
  			int [][] A = new int [m][n];
  			int [][] B = new int [p][q];
  			int [][] C = new int [m][q];

			for (int i = 0; i < m; i++)  {
				for (int j = 0; j < n; j++) {
					A[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < p; i++)  {
				for (int j = 0; j < q; j++) {
					B[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < m; i++)  {
				for (int j = 0; j < q; j++) {
					C[i][j] = 0;
				}
			}

			if (n == p) {
				//System.out.println("calculate");
				for (int i = 0; i < m; i++)  {
					for (int j = 0; j < q; j++) {
						for (int k = 0; k < n; k++) {
							C[i][j] += A[i][k] * B[k][j];
						}
					}
				}
				for (int i = 0; i < m; i++)  {
					System.out.print("| ");
					for (int j = 0; j < q; j++) {
						System.out.print(C[i][j] + " ");
					}
					System.out.println("|");
				}
			}
			else {
				System.out.println("undefined");
			}

			m = sc.nextInt();
  			n = sc.nextInt();
  			p = sc.nextInt();
  			q = sc.nextInt();
      		x++;
   		}
	}
}
