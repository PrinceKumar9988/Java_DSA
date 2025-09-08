package OOPS6.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return data.length==size;

    }

    private void resize(){
        int[] temp= new int[size*2];

        // copy current item in new array
        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];

        }
        data=temp;
    }

    public int remove(){
        int remove= data[size];
        return remove;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() { // to ovverride toString() in sout()
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list= new ArrayList();

        CustomArrayList list = new CustomArrayList();

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);

        for (int i = 0; i <14 ; i++) {
            list.add(2*i);
        }

        System.out.println(list); // it will print hascode but toString() Ovveride method is there

        System.out.println(list.size());
        System.out.println(list.remove());
        System.out.println(list.get(2));


    }

}
