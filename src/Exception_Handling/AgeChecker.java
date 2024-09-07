package Exception_Handling;
import java.util.Scanner;

class YoungAgeException extends Exception{
    public YoungAgeException(String msg){
        super(msg);
    }
}
class OldAgeException extends Exception{
    public OldAgeException(String msg){
        super(msg);
    }
}
public class AgeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try{
            checkAge(age);
        }
        catch(YoungAgeException | OldAgeException e){
            System.out.println(e.getMessage());
        }
    }
    static void checkAge(int age) throws YoungAgeException, OldAgeException{
        if(age < 18){
            throw new YoungAgeException("Age is less then 18 , Young age Exception is thrown");
        }
        else if(age > 65){
            throw new OldAgeException("Age is greater than 65, OldAgeException is thrown");
        }
        else{
            System.out.println("Age is in the range");
        }
    }
}
