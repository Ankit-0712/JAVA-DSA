package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Syntax

        ArrayList<Integer> list = new ArrayList<>(6);
       // list.add(67);
       // list.add(23);
       // list.add(34);
        //list.add(45);
        //list.add(56);
        //list.add(89);

       // System.out.println(list.contains(56));
       // System.out.println(list);
        //list.set(0, 99);
       // list.remove(3);


       // System.out.println(list);
        
        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        //get item in any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

    }
}
