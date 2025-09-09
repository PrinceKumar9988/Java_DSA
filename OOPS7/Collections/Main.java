package OOPS7.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Collections // Look at the chart for collections

        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new LinkedList<>();

        list2.add(23);
        list2.add(25);
        list2.add(26);
        list2.add(14);

        System.out.println(list2);

        List<Integer> vector= new Vector<>();// vector synchronisation is related to the threads , in normal arraylist there r multiple threads working but in vector one single thread works at a time and if any other thread has to work on then it has to wait for first one to complete the task.

        vector.add(23);
        vector.add(73);
        vector.add(47);
        vector.add(99);

        System.out.println(vector);


    }
}
