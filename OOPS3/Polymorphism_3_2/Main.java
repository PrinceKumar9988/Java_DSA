package OOPS3.Polymorphism_3_2;


public class Main {
    public static void main(String[] args) {
        // polymorphism means many form
        // Study Entire polymorphism with the hep of notes.

        // static(Compile time polymorphism was alreay done in inheritance(Method Overloading))

        // Dynamic Polymorphism (Method Overriding)

        Shapes s1= new Shapes();
        Circle c1= new Circle();
        Square sq1= new Square();
        Traingle t1= new Traingle();

        s1.Area();
        c1.Area();
        sq1.Area();
        t1.Area();  // It is the way of representing area in various forms.(Act of representing same thinh in multiple ways.)
//
//
        Shapes s2= new Square(); // Dynamic polymorphism(Method Overriding)
        s2.Area();  // reference type will determone what members I can access but which members to acces is determined by object type.i.e. I can access area() but which area() method , one in sgape and other in Square so here square area() method wiLL Override the Shapes one(Parent one).

        // Concept of using Final keyword in polymorphism(Late Binding and Early Binding)
        //  Concepts of using static as keyword in polymorphism


        Shapes st= new Traingle(); //(use static in both shapes and traingle greeting methods() then it will work)
        st.greeting();// concept of using static in polymorphism

        Traingle st1= new Traingle();// aftyer emoving it greeting() from traingles it will run the parent class greeting()
        st1.greeting(); // You can inherit static methods() but cannot ovveride it.(check it with using @Override)






    }
}
