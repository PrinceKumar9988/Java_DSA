package OOPS3.Inheritance_3_1;

public class BoxWeight extends Box{

    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(double l, double h, double w, double weight){

        super(l,h,w);// 1. super is used to call parent class constructor.
                     // 2. note the use of super keyword in the parent class(box class line no. 10)
                     // 3. you can also use super keyword to call the members of parent class from child class as showm below(Line no. 16)
                     // 4. you always need to put super(l,h,w) before initialising the member of child class else it will give error.(Order of initialisation will be from parent class to child class bcs parent class has no idea about members of child class but child class knows about member of both parent and chils class)

        System.out.println(super.h); // what if both parent and child class has same member like weight then super basically helps to call the member which is in parent class.


        this.weight=weight;

    }

    BoxWeight(BoxWeight other){
        super(other); // this class is also similar to the Main class (line no. 43) .i.e. you are passing bocweight here in super but super will call parent class constructor(Box) so it will be only able to access l,h,w not weight. so this has similarity to the main class line no. 43 concept
        this.weight=other.weight;
    }

    BoxWeight(Double side, double weight){
        super(side);
        this.weight=weight;
    }
}
