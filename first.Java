import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = (int)(math.random()*100);
    do{
        system.out.println("Guess a number from 1 to 100");
        int guess = sc.nextInt();
        if(guess == number){
            system.out.println("You guessed it!");
            break;
        }
        else if(guess > number){
            system.out.printIn("Your guess is too high");
        }
        else{
            system.out.println("Your guess is too low");
    }
    }
}
}
```