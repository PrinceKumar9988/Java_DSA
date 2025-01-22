public class stringss {
    public static void main(String[] args) {

        //        String name = "Prince";
//        System.out.println(name);
//
//        int a=10;
//        int b=a;   // making a new object
////
//        System.out.println(a);
//        System.out.println(b);
//
//        a=5;
//
//        System.out.println(a);
//        System.out.println(b); // doesnot work in the case of integer(primitive)


        // Working in arrays properly:-

//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = a;
//        a[0] = 99;
//        System.out.println(Arrays.toString(a)); //a[0]=99
//        System.out.println(Arrays.toString(b));  // b[0]=99;

//        **********COMPARISONOFSTRINGS**********


//          String a="Prince";
//          String b="Prince";

//        System.out.println(a==b);  //same object of different refrence value //true

        // how to make different objects for different values:- So we will be creating two different objects with the help of new keyword

        String a= new String("Prince");
        String b= new String("Prince");

        // now both the variable are pointing to different objects

//        System.out.println(a==b);   // false


        // How to check values only??   (by using .equals method)

        System.out.println(a.equals(b)); // true


//        System.out.println(a.charAt(0));  // to access the elements in string
//
//
//        System.out.println(56);
//        System.out.println("Prince");
//        System.out.println(Arrays.toString(new int[]{2,3,4,56}));


//   It is basically saying that ask me to print anything, first  I will convert it into string and then print it
//  .tovalue and then .toString

//      Integer num=new Integer(56);
//        System.out.println(num);
//        System.out.println(num.toString());


//***************PrettyPrinting**************

//        float a=453.1276f;
//        System.out.printf("Formatted number is %.2f", a);   // It is used to round off number as well


//        System.out.println(Math.PI);

//        System.out.printf(" pie: %.2f", Math.PI);

//        System.out.printf("Hello my name is %s and I am %s", "Prince", "Cool");

        // these %f and %s are placeholders so learn about them more from internet. It is format specifier that we can use
//  https://www.geeksforgeeks.org/format-specifiers-in-java/      learn about format specifier from here


//        ******************OPERATORS************

//        System.out.println('a'+'b');  // here it will add the ASCII value of a and b
//        System.out.println("a"+"b");  // here it will concatinate teh a and b

//        ASCII values of A is 65 and Z is 90. ASCII values of a is 97 and z is 122


//        System.out.println('a'+3);
//        System.out.println((char)('a'+3));
//
//        System.out.println("a" + 1);    // type coersion

//   integer will be converted to Integer that will call toString()

// more complex stuff :-

//        System.out.println("Prince" + new ArrayList<>());
//        System.out.println("Pappu" + new Integer(45));

//        System.out.println(new ArrayList<>() + new Integer(45));  // error

//    the operator + in java is only defined for primitives or if any one of the value is string

//        System.out.println(new ArrayList<>() +" "+ new Integer(45));





//*****************String Performance************

//        String series="";
//        for (int i=0;i<26;i++){
//            char ch=(char)('a'+i);
//            System.out.println(ch);
//            series=series+ch;
//        }
//        System.out.println(series);

        // here series is making new object everytime the loop iterates so it is like a, ab ,abc, abcd,abcde upto abcdefghijklmnopqrstuwxyz and takes lot of memory and it would be better if we can have somethings in which we can add strings(we cannot do it here because strings are immutable) so StringBuilder comes into the picture



//       String p="Prince";
//       char[] arr=p.toCharArray();
//
//        System.out.println(Arrays.toString(arr));

    }
}
