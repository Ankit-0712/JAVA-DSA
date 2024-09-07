package Lab;
class M{
   public void show(){
        System.out.println("display of M");
    }
}
class N extends M{
    public void show(){
        System.out.println("display of N");
    }
}

public class overriding {
    public static void main(String[] args) {
        M obj1 = new M();
        N obj = new N();
        obj.show();
    }
   
    
}
