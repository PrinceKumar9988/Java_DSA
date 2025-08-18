package OOPS2.OOPS2_3;

public class StaticBlock {

    static int a=5;
    static int b;


    static { // static block runs only once when the object is created .i.e. when class is loaded for the first time
        System.out.println("I am inside static block");
        b=a*5;
    }

    public static void main(String[] args) {

        StaticBlock obj= new StaticBlock();
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);

        StaticBlock obj1= new StaticBlock();
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);




    }
}
