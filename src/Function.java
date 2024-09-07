import java.util.*;
public class Function {
    //public static int calculateSum(int a, int b){
        //int sum = a+b;
       // return sum;
   // }
    
   // public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
       // int num1= sc.nextInt();
       // int num2 = sc.nextInt();
       // int sum = calculateSum(num1, num2);
        //System.out.println(sum);
       public static void printFactorial(int n){
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial *i;
        }
        System.out.println(factorial);
        return;
       }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
    
}

