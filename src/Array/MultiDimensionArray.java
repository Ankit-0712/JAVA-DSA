package Array;
import java.util.*;
public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3]; 

        //input
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();


            }
        }
        //output
       // for(int i=0;i<arr.length;i++){
           // System.out.println(Arrays.toString(arr[i]));

       // }

       //Enhanced for loop

       for(int[] a:arr){
        System.out.println(Arrays.toString(a));
       }
        

    }
}
