package array;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args){
      System.out.println("enter the 2D array");
      int[][] arr =new int[3][];
      for(int row=0;row<arr.length;row++){
          for(int col=0;col<arr[row].length;col++)
          {
            System.out.print(arr[row][col]);
          }
      }
    }
}
