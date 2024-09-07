import java.util.*;
class Poly {
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
    public static void main(String [] args){
        Poly obj = new Poly();
        obj.sum();
        obj.sum(50.8,90.8);
    }
    
}
