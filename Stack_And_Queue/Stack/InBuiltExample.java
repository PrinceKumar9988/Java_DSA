package Stack_And_Queue.Stack;

import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {

        Stack<Integer> stack= new Stack<>();

        stack.push(34);
        stack.push(75);
        stack.push(13);
        stack.push(24);
        stack.push(67);

        System.out.println(stack.peek()); // It gives u topmost element without removing it.
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
