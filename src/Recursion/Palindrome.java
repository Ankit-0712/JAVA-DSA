package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1234321)); // Corrected input to be a palindrome for demonstration
    }
    
    static boolean palin(int n) {
        return n == rev(n, 0);
    }

    static int rev(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return rev(n / 10, sum);
    }
}
