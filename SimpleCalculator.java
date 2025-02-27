import java.util.Scanner;

public class SimpleCalculator {
    // Properties of the calculator
    private double num1;
    private double num2;
    private char operation;

    // Method to set numbers
    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to set operation
    public void setOperation(char operation) {
        this.operation = operation;
    }

    // Method to perform calculation
    public void calculate() {
        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please try again.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();

        System.out.println("Welcome to the Simple Calculator!");

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        calculator.setNumbers(firstNumber, secondNumber);

        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        calculator.setOperation(operation);

        calculator.calculate();

        scanner.close();
    }
}