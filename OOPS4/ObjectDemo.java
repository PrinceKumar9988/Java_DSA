package OOPS4;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) { // it is a object
        this.num = num;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public boolean equals(Object obj) { // .equals()checks content if content is equal or not but == checks references of two )
        return this.num==((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() { // I have done it in detail in HashMap lecture
                            // HashCode means unique representation object in number.
        return super.hashCode();
    }

    @Override
    public String toString() {    // Already Done(in OOPS2_4(InnerClasses))
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {  // Already Done(In OOPS1_2(class A))
        super.finalize();
    }

    public static void main(String[] args) {

        ObjectDemo obj= new ObjectDemo(12);
        System.out.println(obj.hashCode());// number that get in hascode is not the address but some random number which hashcode() method proivdes you using some algorithm
        System.out.println(obj);

        ObjectDemo obj2= new ObjectDemo(12);

        if(obj.equals(obj2)){
            System.out.println("Both nums are equal");
        }


    }
}
