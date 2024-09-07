package Exercise;
//Method overriding
class shape{
    int a = 20;
    int b = 40;
    int ans;
  
    void area(){
         ans = a*b;
         System.out.println(ans);
    }
}

class square extends shape{

    void area(){
        ans = a*a;
        System.out.println(ans);

    }
}
public class exercise1 {
    public static void main(String[] args){
        square s1 = new square();
       
        s1.area();
    }
    
}
