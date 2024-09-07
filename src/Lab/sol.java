package Lab;
import java.util.*;
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

    public void sum(){
        int v1,v2,ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        ans = v1+v2;
        System.out.println(ans);
    }
    public void sum(int a, int b){
        int temp = a+b;
        System.out.println(temp);
    }
    public void sum(double x, double y){
        System.out.println(x+y);
    }
    
}

public class sol {
    
    public static void main(String[] args){
        show s1 = new show(23, 24);
        show s2 = new show(4, 5, 6);
        show s3 = new show("Welcome");

        s1.sum(23,24);
        s1.sum(23.5,35.6);
        
    }
}
