package OOPS3.Inheritance_3_1;

public class Box {

    double l;
    double h;
    double w;


     Box(){
        super(); // super keyword is generally used to refer to the upper class or parent class but it can also be used here in the parent class and it references to the Object class. Every first class that you make refers to the Object class.
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    //cube
    Box(double side){

        this.l=side;
        this.w=side;
        this.h=side;
    }

    Box(double l, double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }

    public void information(){
        System.out.println("running the box");
    }

}
