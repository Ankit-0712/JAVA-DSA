package Lab;
class Parent{
    Parent(){
        System.out.println("Parent constructor");
    }
    void diplay(){
        System.out.println("Method from parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child constructor");
    }
    void display(){
        System.out.println("Method from child");
    }
}
class grandchild extends Child{
    grandchild(){
        System.out.println("grandchild constructor");
    }
    void diplay(){
        System.out.println("Method from grandchild");
    }
}
public class multileveInherit {
    public static void main(String[] args){
        Child c1 = new Child();
        grandchild g1 = new grandchild();
        c1.diplay();
        g1.diplay();
    }
    
}
