//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Input birth month, check if in range 1-12, output month or error message

        // Declare variables
        int birthMonth = 0;

        // Create scanner for input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your birth month (1-12): ");
        birthMonth = input.nextInt();

        // Range checking with if-else
        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        input.close();
    }
}