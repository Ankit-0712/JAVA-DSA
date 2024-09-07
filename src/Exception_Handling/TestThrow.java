package Exception_Handling;

public class TestThrow {
    static void Test(int age){
        if(age < 18){
            throw new ArithmeticException("Person is not elligible");
        }
        else{
            System.out.println("Person is elligible");
        }
    }
    public static void main(String[] args){
        Test(13);

    }
}

