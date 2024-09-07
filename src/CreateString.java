import java.util.Scanner;

public class CreateString {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Create the string using the first three characters (or "#")
        String resultString = createString(inputString);

        // Print the result
        System.out.println("Result: " + resultString);
    }

    // Function to create a string using the first three characters (or "#")
    private static String createString(String inputString) {
        if (inputString.length() >= 3) {
            return inputString.substring(0, 3);
        } else {
            // If the length is less than 3, use "#" as a substitute character
            StringBuilder result = new StringBuilder(inputString);
            while (result.length() < 3) {
                result.append("#");
            }
            return result.toString();
        }
    }
}

