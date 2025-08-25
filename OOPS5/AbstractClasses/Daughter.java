package OOPS5.AbstractClasses;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be doctor");

    }

    @Override
    void partner() {

        System.out.println("I love IronMan");

    }
}
