package LinkList;

public class Main {
    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);

        LL ans = LL.merge(first, second);

        ans.display();



       // list.insertFirst(3);
        //list.insertFirst(2);
        //list.insertFirst(8);
     //list.insertFirst(8);

      //list.insertLast(99);

        //list.insert(7, 3);

        //list.display();

        //System.out.println(list.deleteFirst());

        //System.out.println(list.deleteLast());

        //System.out.println(list.delete(2));


        //list.display();
      //  list.insertRec(88, 2);
       // list.display();
       // list.duplicates();
        //list.display();

    }


}
