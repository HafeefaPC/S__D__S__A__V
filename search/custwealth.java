package search;

public class custwealth {
    public static void main(String[] args) {
        int[][] arr ={
            {7,20,30},
            {4,8,54},
            {939,5}, };
            System.out.println(cust(arr));
    }

    static int cust(int[][] num) {
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < num.length; row++) {
            int sum = 0;
            for (int col = 0; col < row; col++) {
                sum = sum + num[row][col];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
