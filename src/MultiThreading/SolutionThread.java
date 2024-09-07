package MultiThreading;
class TestThread extends Thread{
    public void run(){
       try{
        for(int i=0;i<=3;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
       }
       catch(Exception e){
        System.out.println(e);

       }
    }
}
public class SolutionThread {
    public static void main(String[] args) {
        try{
            TestThread th1  = new TestThread();
        th1.start();
        th1.join();
        TestThread th2  = new TestThread();
        th2.start();
        th2.join(); 
        }
      
        catch(Exception e){
            System.out.println(e);
        }
    }
}
