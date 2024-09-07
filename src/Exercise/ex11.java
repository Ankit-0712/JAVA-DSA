package Exercise;
public class ex11 {
    static class StaticNestedClass{
        void display(){
            System.out.println("This is the nested class");
        }
    }
    public static void main(String[] args){
        ex11.StaticNestedClass e1 = new ex11.StaticNestedClass();
        e1.display();
    }
}
