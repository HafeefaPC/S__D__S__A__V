
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number need to check");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.print(ans);
    }

    static boolean isPrime(int n){
    if(n<=1){
        return false;
    }
    int c=2;
    while(c*c<=n){
        if(n%c==0){
            return false;
        }
        c++;    
    }
  return c*c>n;
    }
}
