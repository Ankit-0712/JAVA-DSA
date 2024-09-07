package Exception_Handling;

public class practice {
    public static void main(String[] args){

        try{
            int a = 25/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Exception handled");

        }
        finally{
            System.out.println("finally always execute");
        }
    }
}
