import  java.util.Scanner;

public class inputHandler {
    public Scanner scanner = new Scanner(System.in);

    public String getOperation() {
        System.out.println("Enter the operation which you want to perform.");
        String operation = scanner.nextLine();
        scanner.close();

        return operation;
    }
}
