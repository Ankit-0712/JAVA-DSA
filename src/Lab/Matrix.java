package Lab;
import java.util.*;

public class Matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[3][3];
        for(int i = 0;i<sum.length;i++){
            for (int j=0;j<sum.length;j++){
                sum[i][j]= arr[i][j] + arr2[i][j];
                System.out.println(sum[i][j]+ " ");

                
            }
            System.out.println("\n");
        }
      
        



    }
}
