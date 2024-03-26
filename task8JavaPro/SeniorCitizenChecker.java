import java.util.Scanner;

public class SeniorCitizenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the age of the person from the user
        System.out.print("Enter the age of the person: ");
        int age = scanner.nextInt();
        
        // Check if the person is a senior citizen
        if (age >= 60) {
            System.out.println("The person is a senior citizen.");
        } else {
            System.out.println("The person is not a senior citizen.");
        }
        
        scanner.close();
    }
}