package dsajava.basic;
import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    System.out.println("enter the fruit name");
    String fruit = in.next();
    switch(fruit){
        case "mango":
        System.out.println("king of fruits");
        break;
        case "apple":
        System.out.println("a sweet red fruit");
        break;
        case "orange":
        System.out.println("round fruit");
        break;
        case "grapes":
        System.out.println("small fruit");
        break;
        default:
        System.out.println("please enter a valid fruit");   

    }
    }
}