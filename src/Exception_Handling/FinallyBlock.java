package Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
//Checked Exception
public class FinallyBlock {
    public static void main(String[] args){
        int i,j=1,k=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i=8;
        try{
            System.out.println("Enter a number");
            j =Integer.parseInt(br.readLine());
            k=i/j;
            System.out.println("output is :" + k);
            
        }
        
        catch(IOException e){
            System.out.println("Some IO Error");
            
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally{
            
            System.out.println("BYE");
        }
       
    }
}

