package OOPS5.Default_Method;

public interface A {

    default void fun() {  // reason for using default is in notes.
        System.out.println(" I am in A");
    }

    static void name() {  // static interface methods should always  have a body in interfaces bcs static means object independent and these methods donot inherit so you have to make body here only in the interfaces.

        System.out.println("I am arjun");
    }

}
