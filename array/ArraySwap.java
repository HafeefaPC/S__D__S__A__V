package array;
import java.util.Arrays;
public class ArraySwap {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
         System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr ,int i,int j){
        int temp =arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
   
}
