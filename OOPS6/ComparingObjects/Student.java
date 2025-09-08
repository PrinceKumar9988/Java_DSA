package OOPS6.ComparingObjects;

public class Student implements Comparable<Student> {// comparable is a generic interface.

    int rno;
    float marks;

    public Student(int rno, float marks) {
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("In compareTomethod is getting used here");
        // if diff==0 then no diff
        // if diff<0 then o is bigger else o is smaller
        int diff= (int)(this.marks-o.marks);
        return diff;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", marks=" + marks +
                '}';
    }
}
