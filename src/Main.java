//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world ! Calculator is here to help....!!");

        System.out.println("Enter your name ");

        Scanner scanner = new Scanner(System.in);
        String user_name = scanner.nextLine();

        System.out.println("Hello " + user_name);

        System.out.println("Enter the first number");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number");
        double number2 = scanner.nextDouble();

        System.out.println("Select the operation which you want to perform to the two numbers");
        String operation = scanner.nextLine();

        switch(operation){
            case "add":
                System.out.println("Result: " +(number1 + number2));
                break;
            case "subtract":
                System.out.println("Result: " +(number1 - number2));
                break;
            case "multiply":
                System.out.println("Result: " +(number1 * number2));
                break;
            case "divide":
                System.out.println("Result: " +(number1 / number2));
                break;
            default:
                System.out.println("Unknown operation" + operation);
                break;
        }

        }
    }