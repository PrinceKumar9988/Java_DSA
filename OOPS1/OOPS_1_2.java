package OOPS1;

public class OOPS_1_2 {

    public static void main(String[] args) {

//        wrapper class//        wrapper class example:-
//
//        int a=10;
//
//        Integer num= new Integer(10); // here object is created
//        Integer nums=345;
//        System.out.println(nums.toString());

//        num.

////        Here Integer is class  above and you access its properties by nums.     but you cannot do that with a.

//        int a=10;
//        int b=20;

//        swap(a,b);

//        System.out.println(a+" "+b);  // here the values will not swap bcs in java we have pass by value there is nothing like pass by refrence and here a and b are primitives these are not refrenced so changes made to these will not reflect but if it woulld have been object then it would have changed the value because objects are refrenced(stack and heap) and when you will make function for it copy of refrence of the object will be passed so it will show the change  but reassigning the object inside the method will not affect the original reference.


//        *******************CHATGPT*************

//        In Java, all arguments are passed by value. This can sometimes cause confusion, especially when dealing with objects. Let's clarify what this means for both primitive types and objects.
//
//        Primitive Types:-
//        When a primitive type (such as int, float, char, etc.) is passed to a method, the method receives a copy of the value. Changes to the parameter inside the method do not affect the original value.

//        Objects:-
//        When an object is passed to a method, the method receives a copy of the reference to the object. This means that while the reference itself is passed by value, both the original reference and the method parameter reference the same object. As a result, changes made to the object inside the method will be reflected in the original object. However, reassigning the object inside the method will not affect the original reference.

        Integer a=10;  // even after using Integer it will not swap because of final keyword used in it
        Integer b=20;
//        swap(a,b);
//        System.out.println(a+" "+b);

        // example of final keyword:-

        final int NUM=2;
//        num=3;  // you cannot modify it


        //use of final keyword in objects
        final A kunal=new A("Kunal");
        kunal.name="Prince";

//        kunal= new A("pri"); // if final keyword is used in front of object(refrenced) then you can change the value for it but you cannot change the  refrence to that object, here I was trying to change the refrence foe the object but it is showing error.If you will not use final keyword in object then you reassign the it to new object but you cannot reassign it to new object if you have used final keyword.

        // finalize keyword
        A obj;

        for (int i = 0; i <1000000000 ; i++) {
            obj=new A("prince kumar");  // more than one object cannot point to the same variable

        }

    }
//    static void swap(Integer a,Integer b){
//
//        Integer temp=a;
//        a=b;
//        b=temp;
////        System.out .println(a+" "+b); // it will change here because of the scope of a and b here
//
//    }

}

class A{
    final int a=10;    // final variable needs to be initialised

    String name;
    public A(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }


}
