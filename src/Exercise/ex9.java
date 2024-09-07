package Exercise;

class test{
    test(){
        System.out.println("This is from default constructor");
    }

    test(int x, int y){
        System.out.println(x+y);
    }
}
public class ex9 {
    public static void main(String[] args){
        test t1 = new test();
        test t2 = new test(3, 8);
    }
    
}
