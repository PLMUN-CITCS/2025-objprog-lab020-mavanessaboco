import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. Greet User");
            System.out.println("2. Check Even/Odd");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Greet the user
                    System.out.println("Hello! Welcome!");
                    break;
                case 2:
                    // Check if number is even or odd
                    System.out.print("Enter an integer: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " is an Even number.");
                    } else {
                        System.out.println(number + " is an Odd number.");
                    }
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3); // Continue until the user selects 3 to exit

        scanner.close();
    }
}