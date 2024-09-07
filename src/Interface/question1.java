package Interface;
interface xyz{
    public void sum();
}

interface pqr extends xyz{
    public void sum2();
}

class M implements pqr{
    int a=10, b= 10, ans1;
    int x = 5, y=5,ans2;

    public void sum(){
        ans1 = a+b;
        System.out.println(ans1);
    }

    public void sum2(){
        ans2= x+y;
        System.out.println(ans2);
    }
    int p=2,q=2,r=2, ans3;
    public void sum3(){
        ans3 = p+q+r;
        System.out.println(ans3);
    }

}

class N extends M{
   

}
public class question1 {
    
    public static void main(String[] args){
        N obj = new N();
        obj.sum();
    }
}
