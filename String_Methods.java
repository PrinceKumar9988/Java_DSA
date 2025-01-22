public class String_Methods {

    public static void main(String[] args) {



        //***********************************STRING METHODS****************************************




        // Methods of string are extremely important for solvoing the questions of leetcode:-

        // Following are the String methods:-

//        Note:- ASCII Value of A is 65 and of Z is 90.
//               ASCII Value of a is 97 and of z is 122`.

        String str1 = "Hello";  // Using String literal
        String str2 = new String("World");  // Using new keyword

        str1.length();
        str1.charAt(3);
        str1.substring(1,4); // difference between substring and subsequence
        System.out.println(str1.contains("Hell"));  //true
        str1.equals(str2);  //false
        str1.equalsIgnoreCase("hello"); //true
        str1.isEmpty(); //false
        str1.toUpperCase();
        str1.toLowerCase();
        str1.trim();
        str1.replace("l","x"); // hexxo
        str1.replaceFirst("l", "x"); // hexlo
        "123abc".replaceAll("\\d","*");  // used in some specific DSA problems.
        str1.indexOf('o');  // Returns the first occurrence of a character
//      str1.indexOf(str, fromIndex);   str1.indexOf('l', 3);     Searches from a given index
        str1.lastIndexOf('l');  // Returns the last occurrence of a substring
        str1.startsWith("hell");
        str1.endsWith("llo");
        str1.split("");   // [H,e,l,l,o]   Splits the string based on a regex
        String.join("-", "a", "b", "c");   //→ "a-b-c"   Joins multiple strings with a delimiter
        str1.toCharArray(); //[H,e,l,l,o]  Converts a string to a character array
//      + Operator	Basic concatenation	"Hello" + " World" → "Hello World"
//      str1.concat(" kaise ho");


    }
}
