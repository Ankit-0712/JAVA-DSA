package HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        //creation
        HashSet<Integer> set  = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search-contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contain");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }

        //Iterator
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
