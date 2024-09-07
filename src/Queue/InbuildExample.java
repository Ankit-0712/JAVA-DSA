package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class InbuildExample {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        
    }
}
