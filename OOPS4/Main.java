package OOPS4;

public class Main {
    public static void main(String[] args) {

        A a = new A(9,"prince");
//        a. num // you cannot access it bcs num is private but u can do it using getter() and setter() methods.
        System.out.println(a.getNum()); // you access it like this by using getter and setter methods.

    }
}
