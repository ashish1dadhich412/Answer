import java.util.Scanner;

// Custom Exception for Invalid Age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Task 1: Handling multiple exceptions
            System.out.print("Enter a number to divide: ");
            int number = scanner.nextInt();
            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();

            int result = number / divisor;  // Potential division by zero
            System.out.println("Result: " + result);

            // Task 2: Throwing custom exception
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18 || age > 100) {
                throw new InvalidAgeException("Age must be between 18 and 100.");
            } else {
                System.out.println("Age is valid: " + age);
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}