import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Convert the integer to a string and count its length
        int digitCount = String.valueOf(number).length();
        
        // Print the number of digits
        System.out.println("Number of digits in " + number + " is: " + digitCount);
        
        scanner.close();
    }
}
