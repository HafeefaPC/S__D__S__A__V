package dsajava.basic;

import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the fruit name");
      String fruit = sc.next();

      switch (fruit){
        case "mango" -> System.out.println("king of fruits");
        case "apple" -> System.out.println("a sweet red fruit");
        case "orange"->System.out.println("Round fruit");
        case "grapes"->System.out.println("small fruit");
        default -> System.out.println("please enter a valid fruit");
      }
    }
}
