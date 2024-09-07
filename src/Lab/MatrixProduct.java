package Lab;
import java.util.*;
public class MatrixProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i][j] =  sc.nextInt();
            }
        }

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr2[i][j]= sc.nextInt();
            }
        }
        int[][] prod = new int[2][2];
        for(int i =0;i<prod.length;i++){
            for(int j=0;j<prod.length;j++){
                for(int k=0;k<prod.length;k++){

                    prod[i][j] = prod[i][j] + arr1[i][k]*arr2[k][j];
                    
                }
            }
            
        }
        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod.length;j++){
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();
        }

    }
}
