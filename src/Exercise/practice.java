package Exercise;
class xyz{

}
interface MyInterface {
    void myMethod();
}

public class practice {
    public static void main(String[] args){
        MyInterface m1 = new MyInterface() {
            public void myMethod(){
                System.out.println("This is the implemention of anonymous inner class");
            }
        };

        m1.myMethod();
    }
   
    }

