package OOPS1;

public class OOPS_1_0 {

    public static void main(String[] args) {

//        int[] rno=new int[5];         // roll no. of student
//        String[] name=new String[5];  // name of students
//        float[] marks=new float[5];   // marks of students

        Student[] students = new Student[5];

//        Student kunal;   // declaration of refrence variable which will be pointing to the object in heap memory
//        System.out.println(Arrays.toString(students));   // array of null

//        Student kunal = new Student(45,"prashant",67.5f);
        Student kunal = new Student();   // constructor overloading
//        Student student1 = new Student();


        kunal.rno=15;
        kunal.marks=85.7f; // this one overRides
        kunal.name="Kunal Kushwaha";

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

//        kunal.changeName("prince");
//        kunal.greeting();

        // passing of object as aargument in another object
        Student random= new Student(kunal);
        System.out.println(random.name);


        // calling a constructor from another constructor
//        Student randon2= new Student();
//        System.out.println(randon2.name);


        // memory allocation of new keyword:-
        Student one = new Student();
        Student two = one;
        // in above scnerio both one and two are pointing to the same object in heap memory and any change made to one will to lead to chage on other one as follow:

        one.name="Prince";
//        System.out.println(two.name);



    }
}
// Create a class:-
class Student{

    int rno;
    String name;
    float marks=65.7f;

    void greeting(){
        System.out.println("Hello My name is "+ name);
    }
    void changeName( String newName){  // it do changes the name
        this.name=newName;
    }

    // we need a way to add the values of the above properties object by object
    // to do it we need a specific keyword .i.e. this

    Student(){
//            this.rno=13;
//            this.name="pappua";
//            this.marks=45.54f;

        // suppose its empty: for random2 object
        // internally: new Student(45,"shanky",78.67f) // new object is being created here
        this(45,"shanky",78.67f);


    }

    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;

    }

    Student(Student other){
        this.name= other.name;
        this.rno=other.rno;
        this.marks= other.marks;
    }

}
