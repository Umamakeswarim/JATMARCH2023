package task8JavaPro;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the first number from the user
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        // Get the second number from the user
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        // Print the original numbers
        System.out.println("Original numbers: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        
        // Swap the numbers using an additional variable
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        
        // Print the swapped numbers
        System.out.println("\nSwapped numbers: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        
        scanner.close();
    }
}

