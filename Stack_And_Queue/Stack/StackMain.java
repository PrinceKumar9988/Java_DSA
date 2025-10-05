package Stack_And_Queue.Stack;

public class StackMain  {
    public static void main (String[] args) throws StackException{

//        CustomStack stack = new CustomStack(5);
        CustomStack stack = new DynamicStack(5);// here is it is dynamic stack in which if u try to insert the element in array after it's size then array will double it's size ( DEFAULT_SIZE )

        stack.push(34);
        stack.push(75);
        stack.push(13);
        stack.push(24);
        stack.push(67);
        stack.push(45);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
