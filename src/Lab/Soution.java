package Lab;
class Shape{
    void area(){
        System.out.println("Area from shape");
    }

    void volume(){
        System.out.println("Volume from shape");
    }
}

class Ractangle extends Shape{
    void show(){
        System.out.println("Show of ractangle");
    }
}

class Sqaure extends Shape{
    void dispay(){

    }
}

public class Soution {
    public static void main(String[] args) {
        Ractangle r1 = new Ractangle();
        r1.area();
        r1.volume();
        r1.show();
    }
    
}
