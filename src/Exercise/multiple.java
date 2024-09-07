package Exercise;
interface flyable{
    public void fly();
}

interface swimmable{
    public void swim();
}

class Duck implements flyable, swimmable{
    public void fly(){
        System.out.println("Duck is flying");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }
}
public class multiple {
    public static void main(String[] args){
        Duck d1 = new Duck();
        d1.fly();
        d1.swim(); 
    }
    
}
