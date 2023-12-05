
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number need to check");
        int n = in.nextInt();
        boolean ans = arm(n);
        System.out.print(ans);
    }

    static boolean arm(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        return  sum==original ;
    }
}
