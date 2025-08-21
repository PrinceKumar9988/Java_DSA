package OOPS3.Encapsulation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        encapsulate e= new encapsulate();
        System.out.println(e.getL()); // This is encapsulation, Hiding the complexity of system inside class but using getter() and setter() methods you can access the members.
                                      // To know more refer to the notes.(Data Hiding, Encapsulation, Abstraction), Encapsulation is one of the sub parts of data hiding.
                                      // Encapsulation focuses on hiding complexity of system and data hiding focuses on hiding complexity of system and data security as well

        // ArrayList is the example of Encapsulation. refer to the notes

        ArrayList<Integer> l1= new ArrayList();
        // all data members are private here but you cannot manipulate it directly so getter() and setter() Methods are used to manipuate the ArrayList. This is what the encapsulation is.i.e. warappinf all the data members inside the class and using getter and setter to manipulate it.
    }
}

