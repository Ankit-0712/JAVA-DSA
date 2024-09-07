package MultiThreading;
class A extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class PriorityThread {
    public static void main(String[] args){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");

        t1.setPriority(10);
        t2.setPriority(6);
        t3.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
    }
}
