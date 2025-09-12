package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();// Default LinkedList
//        list.add(5);

        LL list= new LL();
        list.InsertFirst(3);
        list.InsertFirst(7);
        list.InsertFirst(9);
        list.InsertFirst(17);
        list.InsertLast(99);
        list.insert(100,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(7));
        list.display();

    }
}
