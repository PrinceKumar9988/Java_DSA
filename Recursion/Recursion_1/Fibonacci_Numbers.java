package Recursion.Recursion_1;

public class Fibonacci_Numbers {
    public static void main(String[] args) {

        // In fibonacci numbers this is the sequence
//         0,1,1,2,3,5,8.....  0 is the 0th fibinacci number, 1 is the first

        System.out.println(fibonacci(6));
    }

    static int fibonacci(int n){
        if(n<2){
            return n;
        }


        return fibonacci(n-1)+ fibonacci(n-2);
    }
}
