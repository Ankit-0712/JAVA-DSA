
package Array;
import java.util.*;

public class Input { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
       for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
       } 
       //for(int i = 0;i<arr.length;i++){
        //System.out.print(arr[i]+ " ");
       
        //for-each loop

       for(int num : arr){ // for every element in array,print the element
        System.out.print(num + " "); //here num represent element of the array
       }
    }
}
