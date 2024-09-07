package Exercise;
//abstract class and interface
abstract class Animal{
    abstract void sound();

    void sleep(){
        System.out.println("Animal is sleeping");
    }

}

interface jumpable{
    public void jump();

    default void run(){
        System.out.println("Animal is running");
    }
}

class Dog extends Animal implements jumpable{
   public void sound(){
        System.out.println("Dog barks");
    }

   public void jump(){
        System.out.println("Dog jumps");
    }
}

public class exercise7 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sleep();
        dog.sound();
        dog.jump();
        dog.run();

    }
}
