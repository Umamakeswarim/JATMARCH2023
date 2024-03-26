import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate the factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Print the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
}