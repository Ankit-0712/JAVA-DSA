package Queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class deQueue {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(24);
        deque.addLast(34);
        deque.removeFirst();
        
    }
}
