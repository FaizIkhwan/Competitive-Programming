/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {-100, -2, 0, 5, 7, 10, 20, 50};
        /*
         0 = pling kiri index nk cari
         9 = pling kanan index nk cari
         7 = apa yg nk dicari
         */
        int index = binSearch(arr, 0, 9, 7);
        System.out.println(index);
    }

    static int binSearch(int arr[], int left, int right, int search) {
        while (left <= right) {
            int m = left + (right - left) / 2;

            if (arr[m] == search) {
                return m;
            }

            if (search < arr[m]) {
                right = m - 1;
            }

            if (search > arr[m]) {
                left = m + 1;
            }
        }
        return -1;
    }
}
