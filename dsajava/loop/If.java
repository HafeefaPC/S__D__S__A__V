package dsajava.loop;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = input.nextInt();
        if (salary > 200000) {
            System.out.println("You are rich");
        } else {
            System.out.println("You are poor");
        }
    }
}

//largest of 3 numbers can be find by using   separate 2 if loops 
 //if(a>b) max=a; else max=b; othere if loop if(c>max) max=c;

 //or by using function math.max(a,math.max(b,c));