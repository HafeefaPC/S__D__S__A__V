package search;

import java.util.Arrays;

public class Twodmax {
    public static void main(String[] args) {
        int[][] arr = {
                {7, 20, 30},
                {4, 8, 54},
                {939, 5, 0}, // Corrected the number of elements in the last row
        };

        int ans = search(arr);
        System.out.println(ans);
    }

    static int search(int[][] arr) {
        int max = arr[0][0];
        for (int[] rows : arr) {
            for (int element : rows) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
