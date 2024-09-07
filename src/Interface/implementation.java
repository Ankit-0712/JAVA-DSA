package Interface;
interface xyz{
   public void sum1();
    final double pi = 3.14;
}

interface pqr{
    void sum2();
 final int num= 20;
}

class result implements xyz, pqr{
    int a =10, b=10, ans;
    int x=5, y=5, z=5, ans2;
    
    public void sum1(){
        ans = a+b;
        System.out.println(ans);
    }

   public void sum2(){
    ans2 = x+y+z;
    System.out.println(ans2);
   }


        
    

}
public class implementation {
    public static void main(String[] args){
        result r1 = new result();
        r1.sum1();
        r1.sum2();


    }
    
}
