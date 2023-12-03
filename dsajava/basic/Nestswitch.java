package dsajava.basic;
import java.util.Scanner;

public class Nestswitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empId");
        int empId = sc.nextInt();

        switch (empId) {
            case 1:
                System.out.println("employee name is hafi");
                break;
            case 2:
                System.out.println("employee name is azi");
                break;    
            case 3:
                System.out.println("Enter the department");
                String dept = sc.next();

                switch (dept){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "HR":
                        System.out.println("HR department");
                        break;
                    default:
                        System.out.println("no department");

                }
                break;
                default:
                    System.out.println("no employee");
            
        }
    }
}
