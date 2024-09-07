package Exception_Handling;
class Parent{
    void show(){
        System.out.println("Show of parent");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Show of Child");
    }
}

public class Casting {
    public static void main(String[] args){
        Child c1 = new Child();
        Parent p = c1; //upcasting
        p.show();

        Parent p1 = new Child();
        p1.show();
        
        
    }
}
