package Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
//Checked Exception
public class Demo2Exception {
    public static void main(String[] args){
        int i,j=1,k=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i=8;
        try{
            j =Integer.parseInt(br.readLine());
            k=i/j;
        }
        
        catch(IOException e){
            System.out.println("Some IO Error");
            
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println(k);
    }
}
