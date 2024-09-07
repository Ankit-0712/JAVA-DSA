package LinkList;

public class MainCl {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(5);
        list.insert(3);
        list.insert(17);

        list.delete(3);

        list.display();
    }
}
