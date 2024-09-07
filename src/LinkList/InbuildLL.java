package LinkList;
import java.util.*;
public class InbuildLL {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("A");
        list.addFirst("is");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
