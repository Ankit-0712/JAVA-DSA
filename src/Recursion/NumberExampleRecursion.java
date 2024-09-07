package Recursion;


public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        if(n==5){ //base case
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1); //This is called Tail Recursion , Because this is the last function call
    }
}
