package LinkedList.SinglyLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // To Insert node at First position
    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail== null){
            tail=head;
        }
        size+=1;

    }

    // To insert at last position
    public void InsertLast(int val){

        if(tail== null){
            InsertFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size++;
        // O(1)
        // If there is no tail then simply traverse thhrough entire linkedlist when you gwt null then insert the element o(n)
    }

    // To Insert in between
    public void insert(int val,int index){

        if (index==0){
            InsertFirst(val);
            return;
        }

        if (index== size){
            InsertLast(val);
            return;
        }

        Node temp=head;

        for (int i = 1; i <index ; i++) {
            temp=temp.next;

        }
        Node node= new Node(val,temp.next); // reason for making second constructor of Node class.
        temp.next=node;
        size++;

    }

    // To display Nodes
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ "-> ");
            temp=temp.next;
        }
        System.out.println("END");

    }

    // To delete first Node
    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;

    }

    // To find a particular node with the value given
    public Node find(int value){

        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    // Method of getting nodes
    public Node get(int index){
        Node temp=head;
        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }
        return temp;
    }

    // To delete LastNode of LL
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int value= tail.value;;
        tail=secondLast;
        tail.next=null;
        size--;
        return value;

    }

    // To delete node iin between
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev= get(index-1);
        int value= prev.next.value;
        prev.next=prev.next.next;
        size--;

        return value;
    }


    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

}
