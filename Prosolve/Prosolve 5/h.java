//This is a sample program to solve the linear equations.

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Class GaussianElimination *
 */
public class h {

    public void solve(double[][] A, double[] B) {
        int N = B.length;
        for (int k = 0; k < N; k++) {
            /**
             * find pivot row *
             */
            int max = k;
            for (int i = k + 1; i < N; i++) {
                if (Math.abs(A[i][k]) > Math.abs(A[max][k])) {
                    max = i;
                }
            }

            /**
             * swap row in A matrix *
             */
            double[] temp = A[k];
            A[k] = A[max];
            A[max] = temp;

            /**
             * swap corresponding values in constants matrix *
             */
            double t = B[k];
            B[k] = B[max];
            B[max] = t;

            /**
             * pivot within A and B *
             */
            for (int i = k + 1; i < N; i++) {
                double factor = A[i][k] / A[k][k];
                B[i] -= factor * B[k];
                for (int j = k; j < N; j++) {
                    A[i][j] -= factor * A[k][j];
                }
            }
        }

        /**
         * Print row echelon form *
         */
        /**
         * back substitution *
         */
        double[] solution = new double[N];
        for (int i = N - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < N; j++) {
                sum += A[i][j] * solution[j];
            }
            solution[i] = (B[i] - sum) / A[i][i];
        }
        /**
         * Print solution *
         */
        printSolution(solution);
    }

    /**
     * function to print in row echleon form *
     */
    /**
     * function to print solution *
     */
    public void printSolution(double[] sol) {
        DecimalFormat df= new DecimalFormat("0.0");
        int N = sol.length;
        for (int i = 0; i < N; i++) {
            
            if ((Double.parseDouble(df.format(sol[i]))-(int)Math.round(sol[i]))==0.00)                
                System.out.printf("%.0f ", sol[i]);
                           
            else  
                System.out.printf("%.1f ", sol[i]);                        
        }
        System.out.println();
    }

    /**
     * Main function *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int k = 0; k < t; k++) {
            h ge = new h();
            int N = scan.nextInt();

            double[] B = new double[N];
            double[][] A = new double[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = scan.nextDouble();
                }
                B[i] = scan.nextDouble();
            }
            System.out.print("Case #"+(k+1)+": ");
            ge.solve(A, B);
        }
    }
}
