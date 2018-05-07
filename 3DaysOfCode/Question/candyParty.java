# Sudoku checker

import java.io.*;
import java.util.*;

public class candyParty
{   
    static private boolean checkSudokuStatus(int[][] grid) 
    {
        for (int i = 0; i < 9; i++) 
        {
            int[] row = new int[9];
            int[] square = new int[9];
            int[] column = grid[i].clone();

            for (int j = 0; j < 9; j++) 
            {
                row[j] = grid[j][i];
                square[j] = grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
            }
            if (!(validate(column) && validate(row) && validate(square))) 
            {
                return false;
            }
        }
        return true;
    }

    static private boolean validate(int[] check) 
    {
        int i = 0;
        Arrays.sort(check);
        for (int number : check) 
        {
            if (number != ++i) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {        
        Scanner sc = new Scanner(System.in);

        int[][] sMatrix = new int[9][9];
        for (int[] sMatrix1 : sMatrix) 
        {
            for (int j = 0; j < sMatrix1.length; j++) 
            {
                sMatrix1[j] = sc.nextInt();
            }
        }
        
        if (checkSudokuStatus(sMatrix)) 
        {
            System.out.println("Valid");
        } 
        else 
        {
            System.out.println("Invalid");
        }
    }
}
