
import java.util.Scanner;

public class StringE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String name = in.next();
        System.out.println(greet(name));
    }

    static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
