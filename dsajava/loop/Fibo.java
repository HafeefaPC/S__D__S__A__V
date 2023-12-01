package dsajava.loop;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = input.nextInt();

        int f = 0;
        int l = 1;

        System.out.print(f + " " + l + " ");

        int count = 2;
        while (count < n) {
            int temp = l;
            l = l + f;
            f = temp;
            count++;
            System.out.print(l + " ");
        }

        input.close(); // Close the Scanner to avoid resource leak
    }
}
