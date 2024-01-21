//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Wait for user input before proceeding
        System.out.print("Press Enter to continue...");
        scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Continue with the loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}