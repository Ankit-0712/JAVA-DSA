import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            try {
                System.out.println("");
                i = sc.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine(); // consume the invalid input
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        
        double d;
        while (true) {
            try {
                System.out.print("");
                d = sc.nextDouble();
                break;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine(); // consume the invalid input
                System.out.println("Invalid input. Please enter a valid double.");
            }
        }
        
        String s = sc.nextLine();
       

        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        System.out.println("String: " + s);

        sc.close();
    }
}
