package OOPS3.Inheritance_3_1;

public class Main {
    public static void main(String[] args) {
//
//        Box b1= new Box();
//        System.out.println(b1.l);
//
//        Box b2= new Box(4);
//        System.out.println(b2.w);
//
//        Box b3= new Box(b2);
//        System.out.println(b3.l);
//        System.out.println(b3.w);
//        System.out.println(b3.h);
//
//        Box b4 = new Box(2,6,7);
//        System.out.println(b4.l);
//        System.out.println(b4.w);
//        System.out.println(b4.h);

        // BoxWeight ( public class BoxWeight extends Box )

        BoxWeight bw1= new BoxWeight();
        System.out.println(bw1.l+ " "+bw1.weight);

        BoxWeight bw2= new BoxWeight(2.3,4.5,7.8,5.7);
        System.out.println(bw2.l);
        System.out.println(bw2.h);
        System.out.println(bw2.w);
        System.out.println(bw2.weight);


        // Different concept(different type of reference variable and different object)

        Box b5= new BoxWeight(2,4,7,9);

        System.out.println(b5.l);
//        System.out.println(b5.weight); // it is the type of reference variable(Box) not the type of object(BoxWeight) that determines what members can be accessed. So you cannot access weight here.


//        IMPORTANT:-
//        BoxWeight b6= new Box(2,4,8);  // It will give error: you can access all the members of reference type BoxWeight but constructor that you are calling here(Box) doesnot know what is weight variable. child class knows the member of parent class doesnot know the members of child class.


        // Above all was single Inheritance

        // MultiLevel Inheritance

        BoxPrice bp= new BoxPrice(2,6,8);





    }
}
