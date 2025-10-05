package Stack_And_Queue.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExample {
    public static void main(String[] args) {


//      **********************************************QUEUE****************************************

        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(3);
//        queue.add(2);
//        queue.add(38);
//        queue.add(34);
//        queue.add(23);
//
//
//        System.out.println( queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());




//         ******************************************* DEQUE *************************************************


        // In deque you can add and remove from start and end both.

        Deque<Integer> deque=  new ArrayDeque<>(); // ArrayDeque has no capacity restriction.
                                                   // ArrayDeque is faster than LinkedList and stack

        deque.add(4);
        deque.add(89);
        deque.add(54);
        deque.add(15);

        System.out.println(deque.remove());
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());



//        deque.addFirst(34);
//        deque.addLast(6);









    }
}
