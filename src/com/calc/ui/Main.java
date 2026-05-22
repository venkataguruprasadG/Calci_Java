package com.calc.ui;

// Crucial: Import the math logic from the service package!
import com.calc.service.operationExe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of our professional math engine
        operationExe calcEngine = new operationExe();

        System.out.println("=== Professional Modular Calculator ===");
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!\n");

        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine(); // Clear scanner buffer

        System.out.println("Type the operation (add, sub, mul, div): ");
        String operation = scanner.nextLine();

        // 🚀 THE MAGIC LINK: Sending the data to our separate service class
        double result = calcEngine.execute(number1, number2, operation);

        // UI layer decides how to show the results
        if (Double.isNaN(result)) {
            System.out.println("\n[ERROR] Math Error: Division by zero is not allowed.");
        } else if (result == Double.MIN_VALUE) {
            System.out.println("\n[ERROR] Input Error: Unknown operation '" + operation + "'");
        } else {
            System.out.println("\nCalculation Successful!");
            System.out.println("Final Result: " + result);
        }

        scanner.close();
    }
}