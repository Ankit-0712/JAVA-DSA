package LinkList;

public class MainDl {
    public static void main(String[] args){
        DLL list = new DLL();
        list.insertFirst(23);
        list.insertFirst(25);
        list.insertFirst(3);
        list.insertFirst(17);

        list.insertLast(99);
        
        list.insert(3, 65);
        list.display();

        
    }
}
