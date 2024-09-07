package Exercise;
class Parent{
    Parent(){
        System.out.println("Constructor of Parent");
    }

    void display(){
        System.out.println("Method from Parent");
    }
}

class Child extends Parent{ //single level inheritance
    Child(){
        System.out.println("Constructor of Child");
    }
    void display(){
        System.out.println("Method from Child");
    }
}

class grandchild extends Child{ //multilevel inheritance
    grandchild(){
        System.out.println("Cuonstuctor of granChild");
    }
    void display(){
        System.out.println("Method from grandchild");
    }
}
public class exercise6 {
    public static void main(String[] args){
        Child c1 = new Child();
        c1.display();
        System.out.println();

        grandchild g1 = new grandchild();
        g1.display();

    }
}
