import java.util.*;
public class CompareIntegers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = compare(a,b);
        System.out.println(result);
    }
    static int compare(int a, int b){
        if(a==b){
            return 0;
        }
        else if(a%6== b%6){
            return Math.min(a, b);
        }
        else{
            return Math.max(a, b);
        }
    }
}
