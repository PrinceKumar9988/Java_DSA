package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DLL list = new DLL();
        list.InsertFirst(3);
        list.InsertFirst(2);
        list.InsertFirst(8);
        list.InsertFirst(17);
        list.InsertFirst(19);
//        list.display();
        list.InsertLast(99);
        list.display();
        list.insert(99,35);
        list.display();

    }
}
