public class String_Builder {
    public static void main(String[] args) {

//        What is StringBuilder?
//        ANSWER:-StringBuilder is a mutable sequence of characters used for efficient string manipulation in Java. Unlike String, which is immutable, StringBuilder allows modifications without creating new objects, making it faster and memory-efficient for frequent string operations.

        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch= (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(0);      // there are many methods of builder.  check it out
        System.out.println(builder.toString());


        builder.reverse();      // there are many methods of builder.  check it out
        System.out.println(builder.toString());


        String name="Prince";




//        ***************************************STRINGBUILDER METHODS**************************************************



        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb); // Output: Hello


        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        sb.insert(5, " Java");
        System.out.println(sb); // Output: Hello Java World

        sb.replace(6, 10, "Python");
        System.out.println(sb); // Output: Hello Python World

        sb.delete(6, 12);
        System.out.println(sb); // Output: Hello World

        sb.deleteCharAt(5);
        System.out.println(sb); // Output: HelloWorld

        sb.reverse();
        System.out.println(sb); // Output: dlroWolleH


        System.out.println(sb.length()); // Output: 10

        System.out.println(sb.charAt(1)); // Output: l

        String str = sb.toString();
        System.out.println(str); // Output: Hello World














    }
}
