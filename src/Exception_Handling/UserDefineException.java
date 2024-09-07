package Exception_Handling;



public class UserDefineException {
    public static void main(String[] args){
        int i= 5;
        try{
        if(i<10){
            throw new MyException("Errorrr");
        }
    }
        catch(Exception e){
           System.out.println(e);
        
        }
    }
}
class MyException extends Exception {
    public MyException(String msg){
        super(msg);

    }

}