package LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {

        CLL list = new CLL();
        list.Insert(3);
        list.Insert(9);
        list.Insert(17);
        list.Insert(29);
        list.display();
        list.delete(3);
        list.display();

    }
}
