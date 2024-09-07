package Lab;
class A{
    A(){
        System.out.println("Default of A");
    }

    A(int x, int y){
        System.out.println(x+y);
    }
}

class B extends A{
    B(){
        System.out.println("Default of B");
    }
    B(int m, int n){
       super(m,n);
        System.out.println(m+n);
    }
}

class C extends B{
    C(){
        System.out.println("Default of C");
    }
    C(int r, int s){
        super(r,s);
        System.out.println(r+s);


    }
}

public class Super {
    public static void main(String[] args) {
        
        //A obj = new A();
        //B obj1 = new B();
        //C obj2 = new C();

        A objA = new A(10,10);
        B objB = new B(5,5);
        C objC = new C(4,4);

    
    }
    
}
