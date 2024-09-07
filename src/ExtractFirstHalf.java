import java.util.Scanner;

public class ExtractFirstHalf {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input a string with an even length
        String inputString;
        do {
            System.out.print("Enter a string with an even length: ");
            inputString = scanner.nextLine();
        } while (inputString.length() % 2 != 0);

        // Close the scanner to prevent resource leak
        scanner.close();

        // Extract the first half of the even-length string
        String firstHalf = extractFirstHalf(inputString);

        // Print the result
        System.out.println("Original String: " + inputString);
        System.out.println("First Half: " + firstHalf);
    }

    // Function to extract the first half of an even-length string
    private static String extractFirstHalf(String inputString) {
        int halfLength = inputString.length() / 2;
        return inputString.substring(0, halfLength);
    }
}
