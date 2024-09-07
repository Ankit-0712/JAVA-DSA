package Exercise;

public class ex12 {
    class inner{
        void display(){
            System.out.println("This is inner class");
        }
    }

    public static void main(String[] args){
        ex12 e1= new ex12();
        ex12.inner e2 = e1.new inner();
        e2.display();

    }
}
