package Stack_And_Queue.Stack;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE= 10;

    int ptr=-1;

    public CustomStack(){
        this (DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data=new int[size];
    }


    // To Push Inside Stack:-
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }

        ptr++;
        data[ptr]=item;
        return true;
    }

    // To Pop out from Stack:-
    public int pop() throws StackException { // StackException is our own exception class

        if(isEmpty()){
            throw new StackException("Stack is Empty@-@");
        }

//        int removed=data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    // To peek:- Peek gives the uppermost element in the stack without removing it.
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot Peek, Stack is Empty!!");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }


}
