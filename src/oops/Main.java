package oops;
class sub{
    int v1;
    int v2 ;
    int v3;
    sub(int v1, int v2, int v3){

    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;

    }
    sub(){
        

    }
    public void input(){
        v1=1;
        v2 =2;
        v3 = 4;
    }

    public void display(){
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
public class Main {
    public static void main(String [] args){
        sub obj1 = new sub(5,6,7);
        System.out.println(obj1.v1);
        
        sub random = new sub();
        System.out.println(random.v2);
        

    }
}
