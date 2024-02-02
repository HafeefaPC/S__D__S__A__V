//maximum sum form a 2D maximum in the hourglass shape
package problems;

public class hourglass {
    
    public int maxSum(int[][] grid) {
        int r = grid.length-2;
        int c = grid[0].length-2; 
         int sum = 0;
       for(int i=0;i<r;i++) {
           for(int j=0;j<c;j++){
               int x = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + 
                           grid[i + 1][j + 1] + 
                           grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
               sum =Math.max(sum,x);            
           }
       }
       return sum;
     }
}
