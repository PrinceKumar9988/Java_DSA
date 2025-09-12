package LinkedList.DoublyLinkedList;

import LinkedList.SinglyLinkedList.LL;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public void InsertFirst(int val){
        Node node= new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){ // null pointer exception
            head.prev=node;
        }
        head=node;
//        if(tail== null){ // if tail is included else do it without tail
//            tail=head;
//        }
        size++;

    }

    public void InsertLast(int val){
        Node node= new Node(val);
        Node last=head;

        node.next=null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;

        size++;
    }

    // To insert in between:-
    public void insert(int after,int val){

        Node node = new Node(val);
        Node p= find(after);

        if(p==null){
            System.out.println("Node doesnot exist");
            return;
        }

        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null) {
            node.next.prev = node;
        }

        size++;

    }

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

    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!= null){
            System.out.print(temp.value+" -> ");
            last =temp;
            temp=temp.next;
        }
        System.out.println("END");

        // PRINTING IN REVERSE:-

        System.out.println("Printing in Reverse:-");

        while(last!=null){
            System.out.print(last.value+" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }
    // Do deletion by Yourself



    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
