package Exception_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) throws IOException{
        int i,j=1,k=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        i=8;
        try{
        System.out.println("Enter a number");
        j = Integer.parseInt(br.readLine());
        k = i+j;
        if(k<10){
            throw new ArithmeticException();
        }
        System.out.println("output is: " + k);
        }

        catch(IOException e){
            System.out.println("Some IO Error");
            
        }
        catch(ArithmeticException e){
            System.out.println("Minimum value for the output is 10");
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally{
            
            System.out.println("BYE");
        }

    }
}
