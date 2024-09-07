package MultiThreading;

class A extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= 3; i++) {
            System.out.println(name);
        }
    }
}

public class JoinThread {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        // Start threads t1, t2, and t3
        t1.start();
        t2.start();
        t3.start();

        // Use join() to ensure threads complete in the correct order
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
