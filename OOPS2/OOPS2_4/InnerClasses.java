package OOPS2.OOPS2_4;

public class InnerClasses {  // Outer classes are never static bcs they are not depndent on any other classes they by default worl as static  so no need to make outer classes static.

    static class Test{   // Inner classes are static bcs to show that they are not dependent on object of outer class but solely depend on the outer class only.
                         // If you will not make inner class static then it will be dependent on outer class and and to run innerclass you have to make object for outer most class which is not possible.
                         // In Java, static is used to say this thing belongs to the class, not an object.
                         // Here static doenot mean that you cannot make the object for class Test, you can make the object of class Test but here statuc means that it doesnot depend on the object of outer class.


        String name;

        public Test(String name) {
            this.name=name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test t1= new Test("prince");
        Test t2= new Test("ram");

        System.out.println(t1); // It will give hashcode bcs there is no tString() method in class if there is then it will return the things accordingly.
        System.out.println(t1.name);
        System.out.println(t2.name);

    }
}


// System.out.println()  System is class, out is variable in it which static and of printstream class and tostring() is methhod in printstream class.
