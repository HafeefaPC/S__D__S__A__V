package array;
import java.util.Scanner;
import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args){
       ArrayList< ArrayList<Integer>> arr = new ArrayList<>(5);
      Scanner in =new Scanner(System.in);
        for(int i=0;i<3;i++){
           arr.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             arr.get(i).add(in.nextInt());
            }
        }
        System.out.print(arr);
    }
}
