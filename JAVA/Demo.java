import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int number =0;
         do{
             System.out.println("input a number");
             number =sc.nextInt();
             System.out.println("here is the number : " );
             System.out.println(number);
         }while(number>=0);
        System.out.println("END OF THE LOOP");
    }
}