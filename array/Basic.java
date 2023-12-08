package array;
import java.util.Scanner;
public class Basic{
        public static void main(String[] args){
            int[] hai = new int[20];
            Scanner sc = new Scanner(System.in);
            for( int i=0;i<5;i++){
             hai[i]=sc.nextInt();
            }
            for( int i=0;i<5;i++){
             System.out.print(hai[i] + " ");
            }
            for( int num : hai){
                System.out.print(num + " ");
            }
        }
}