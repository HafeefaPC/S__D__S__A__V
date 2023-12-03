import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = (int)(Math.random()*100);
    int guess;
    do{
        System.out.println("Guess a number from 1 to 100");
         guess = sc.nextInt();
        if(guess == number){
            System.out.println("You guessed it!");
            break;
        }
        else if(guess > number){
            System.out.println("Your guess is too high");
        }
        else{
            System.out.println("Your guess is too low");
    }
    }while(guess != number);
}
}
