import java.util.*;
public class multiplication {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int multi = 1;
        int i;

        for( i=1;i<=10;i++){
            multi = N*i;

            System.out.println(N + " X " + i + " = " + multi);
        }


    }
}
