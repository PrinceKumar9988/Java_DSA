package OOPS4;
import OOPS4.ObjectDemo;

public class InstanceCheck extends ObjectDemo{
    public static void main(String[] args) {

        // instanceof

        InstanceCheck is= new InstanceCheck();
        ObjectDemo obj3= new ObjectDemo();
        System.out.println(is instanceof ObjectDemo);
        System.out.println(is instanceof InstanceCheck);
        System.out.println(is instanceof Object);  // Every class is a instance of Object class. Object class is the root of every class.
        System.out.println(obj3 instanceof Object);
        System.out.println(obj3 instanceof ObjectDemo);


        // .getClass()

        System.out.println(obj3.getClass().getName()); // these things will get stored in heap.
        System.out.println(is.getClass());

    }


}
