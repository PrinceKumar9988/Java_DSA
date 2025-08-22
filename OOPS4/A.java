package OOPS4;

public class A {


    private int num;
    String name;
    int[] arr;

    public int getNum(){ //  getter Mehtod
        return num;
    }

    public void setNum(int num){ // setter Mehtod
        this.num=num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        arr = new int[num];
    }

}
