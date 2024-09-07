import java.util.*;
class Test{
    int v1;
    int v2;
    int ans;
    

    public void datainput(){
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        v1= sc .nextInt();
        v2 = sc.nextInt();
    }

    public void calc(){
        ans = v1+v2;
    }
    public void display(){
        System.out.println(ans);
    }
}
public class scanner {
    public static void main(String [] args){
        Test t1 = new Test();
        t1.datainput();
        t1.calc();
        t1.display();
    }
    
}
