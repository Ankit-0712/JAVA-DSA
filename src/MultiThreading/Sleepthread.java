package MultiThreading;

class A extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for(int i = 0; i <= 3; i++) {
            System.out.println(n);
            try {
                Thread.sleep(1000); // Add sleep to demonstrate thread interleaving
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Sleepthread {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
