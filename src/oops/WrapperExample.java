package oops;
class A{
    final int num = 10;
    String name ;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("object is destroyed");
    }
}
public class WrapperExample {
    public static void main(String [] args){
        //int a =10;
        //int b = 20;
        //Integer num = 45;

        Integer a = 10;
        Integer b = 20;


        swap(a,b);
        System.out.println(a+" "+b);

        
        A obj = new A("Ahiahob");
        System.out.println(obj);
        //for(int i = 0;i<1000;i++){
          //  obj = new A("Random name");
        //}

        
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;

    final A ankit = new A("Ankit");   
    ankit.name = "Other name";

    //When a non primitive is final, you cannot raassign it.
    //ankit = new A("new object");

    }
    
}
