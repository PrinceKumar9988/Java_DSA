package OOPS6.ObjectCloning;

public class Human implements Cloneable {// if u want to clone the objects then you have to implement cloneable interface
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{2,3,4,7,9,4};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    @Override // yes it is ovveriding one in the Objects class by prince.clone() (Main.java)
    public Object clone() throws CloneNotSupportedException{// if u will not use implements cloneable then it will throw CloneNotSupportedException exception

        // shallow copy is used here
        // Shallow copy:  shallow copy copies the  primitives as it is and in non-primitives(referenced ones) it simply points those to the reference original one(01.24.59)
        // thats why any change made to the original one or cloned one in non primitives then changes are refleted at both.(String and arr both are non-primitives)

//        return super.clone();

        // Deep Copy:-

        // In deep copy copies of both primitive and non-primitive(refrenced) are made so if u change anything in one then it will not be reflected in other one.

        Human twin= (Human) super.clone();
        twin.arr= new int[twin.arr.length];
        for (int i = 0; i <twin.arr.length ; i++) {
            twin.arr[i]=this.arr[i];
        }
        return twin;

    }

}
