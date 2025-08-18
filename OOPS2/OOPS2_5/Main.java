package OOPS2.OOPS2_5;

public class Main {
    public static void main(String[] args) {

        SingletonClass obj= SingletonClass.getInstance();
        SingletonClass obj1= SingletonClass.getInstance();

        // refrence of all the objects made here will be same.
    }
}
