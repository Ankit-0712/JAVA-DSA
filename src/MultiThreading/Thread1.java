package MultiThreading;
class A extends Thread{
    public void run(){
        try{
        for(int i=0;i<=5;i++){
            System.out.println("A");
            Thread.sleep(1000);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
public class Thread1 {
    public static void main(String[] args){
        A t = new A();
        t.start();

        for(int i =0;i<=5;i++){
            System.out.println("B");
        }
    }
    
}
