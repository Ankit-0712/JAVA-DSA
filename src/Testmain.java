import java.util.Scanner;

interface Shape{
    
   public void get_input();
    public void area();
    public void display();
}

class rectangle implements Shape{
    int x,y,ans;
   public void get_input(){
       x = 10;
       y = 20;
    }
   public  void area(){
     ans = x * y; 
    }
   public void display(){
        System.out.println(ans);
    }
}

class square implements Shape{
    int a;
    int ans;
  public  void get_input(){
        a = 6;
    }

   public void area(){
        ans = a*a;

    }

   public void display(){
        System.out.println(ans);
    }
}
public class Testmain {
    public static void main(String[] args){
        rectangle r = new rectangle();
        square s = new square();
        r.get_input();
        r.area();
        r.display();

        s.get_input();
        s.area();
        s.display();
    }

    
}

