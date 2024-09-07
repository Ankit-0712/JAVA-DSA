class TestConstructor{
    int v1;
    int v2;
    int ans;
    TestConstructor(int v1, int v2){
        this.v1 = v1;
        this.v2 = v2;
    }
    void calc(){

        ans = v1+v2;
    }
    void display(){

        System.out.println(ans);
    }

    }

public class testcon {
public static void main(String [] args){
    TestConstructor obj = new TestConstructor(30,30);
    obj.calc();
    obj.display();
    TestConstructor obj1 = new TestConstructor(190,189);
    obj1.calc();
    obj1.display();
}
    
}
