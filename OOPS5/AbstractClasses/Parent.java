package OOPS5.AbstractClasses;

//final public abstract class Parent { you cannot have parent abstarct class

public abstract class Parent {
    int age; // you cannot make intergers abstract

     public Parent(int age) { // you cannot create abstract static constructors in init but you can create normal constructors.
        this.age = age;
    }

//    abstract Parent(){};   // you cannot make constructors abstract

    abstract void career();
    abstract void partner();


//    abstract static void pri(){}  //You cannot create abstract static method bcs static methods cannot be overriden annd in abstract methods you have to override.
    static void greet(){// You can create static methods but not abstract static method
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("Hi i am normal mehtod");
    }
}
