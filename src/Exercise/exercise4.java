package Exercise;
//Method, Constuctor overloading
class show{
    show(int a, int b){
        System.out.println(a+b);

    }
    show(int x, int y, int z){
        System.out.println(x+y+z);
    }

    show(String str){
        System.out.println(str);
    }

    public void sum(int m, int n){
        System.out.println(m+n);
    }

    public void sum(double p, double q){
        System.out.println(p+q);
    }
}
public class exercise4 {
    public static void main(String[] args){
    show s1 = new show(23,24);
    show s2 = new show(12, 12, 12);
    show s3 = new show("Hello,World");

    s1.sum(7, 8);
    s1.sum(12.5, 13.7);

}

    
}
