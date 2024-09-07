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
}
public class solu {
    public static void main(String [] args){
        show s1 = new show(23, 24);
        show s2 = new show(23,24,25);
        show s3 = new show("Hello");
    }
    
}
