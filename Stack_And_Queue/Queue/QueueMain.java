package Stack_And_Queue.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {

//        CustomQueue queue= new CustomQueue(5);
        CircularQueue queue= new CircularQueue(5);
        queue.insert(34);
        queue.insert(45);
        queue.insert(63);
        queue.insert(62);
        queue.insert(73);

        queue.display();

        System.out.println(queue.remove());// For removing each element, The TC is O(n), so to solve this problem we will use circular queue implementation.

        queue.insert(233);// Insertion will be always from the last and removal will be from the first(front).

        queue.display();



    }
}
