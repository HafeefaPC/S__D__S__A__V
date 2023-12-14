package search;
import java.util.Arrays;
public class arr2d {
    public static void main(String[] args){
     int[][] arr ={
        {7,20,30},
        {4,8,54},
        {939,5}, };
     int target =5;
     int[] ans= search(arr,target);
     System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
       for(int row=0; row<arr.length;row++){
        for(int col=0;col<row;col++){
             if(arr [row] [col] == target){
                return new int[] {row,col};
             }
        }
       }
    return new int[] {-1,-1};
}
    
}


