package OOPS5.AbstractClasses;

public class Main {
    public static void main(String[] args) {


        Son s= new Son(23);
        s.career();

        Daughter d= new Daughter(25);
        d.career();

//        Parent p= new Parent(95); // you cannot make constructors of abstract class.

        Parent.greet();

        s.normal();

//        Parent d= new Daughter(25); // You cannot make object of Parent class but you can use it as type of reference variable.


    }
}
