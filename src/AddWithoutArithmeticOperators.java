import java.util.Scanner;

public class AddWithoutArithmeticOperators {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Add the numbers without arithmetic operators
        int sum = addWithoutOperators(a, b);

        // Print the result
        System.out.println("Sum: " + sum);
    }

    // Function to add two numbers without arithmetic operators using recursion
    private static int addWithoutOperators(int a, int b) {
        return (b == 0) ? a : addWithoutOperators(a ^ b, (a & b) << 1);
    }
}
