package OOPS6.generics;

import java.util.Arrays;
import java.util.List;

// here T should be the Numbers or its subclasses
public class CustomGenArrayList<T extends Number> { // this extends one is called wildcard.

    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return data.length==size;

    }

    private void resize(){
        Object[] temp= new Object[size*2];

        // copy current item in new array
        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
            
        }
        data=temp;
    }

    public T remove(){
        T remove=(T)(data[--size]); // type casting required bcs of more restrictive type(in a more restrictive type u are adding bigger one)
        return remove;
    }

    public T get(int index){
        return (T) (data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){
        data[index]=value;   // data is of object type so no casting here( In a bigger one you are adding smaller one )
    }

    @Override
    public String toString() { // to ovverride toString() in sout()
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void getList(List<? extends Number> list){// using ? extends let u use subclass of Number class as well.

        // do something
    }

    public static void main(String[] args) {

        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list); // it will print hascode but toString() Ovveride method is there

        System.out.println(list.size());
        System.out.println(list.remove());
        System.out.println(list.get(2));
    }

    }
