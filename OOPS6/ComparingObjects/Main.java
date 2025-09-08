package OOPS6.ComparingObjects;

import java.util.Arrays;
import java.util.Comparator;// used for comaparison of objects

public class Main {
    public static void main(String[] args) {

        Student s1= new Student(5,78.98f);
        Student s2= new Student(9,98.18f);
        Student s3= new Student(19,58.18f);
        Student s4= new Student(49,68.68f);
        Student s5 = new Student(64,68.18f);

        Student[] list={s1,s2,s3,s4,s5};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);// here also compareTo() was used to sort on the basis of marks
        System.out.println(Arrays.toString(list));

//
//        Arrays.sort(list, new Comparator<Student>() { // Another way of doing all these things
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks=o2.marks);
//            }
//        });

        Arrays.sort(list, (o1,o2)-> (int)(o1.marks-o2.marks)); // lambda function(similar to arrow function in JS)





        if(s1.compareTo(s5)<0){
            System.out.println(s1.compareTo(s5));
            System.out.println("s2 has more marks than s1");
        } else{
            System.out.println("s2 has more marks than s1");
        }

    }
}
