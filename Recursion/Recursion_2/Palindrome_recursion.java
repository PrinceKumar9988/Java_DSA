package Recursion.Recursion_2;

public class Palindrome_recursion {
    public static void main(String[] args) {

        String str="aaaabbaaaa";
        int s=0;
        int e=str.length()-1;
        System.out.println(palindrome_check(str,s,e));

    }

    static boolean palindrome_check(String str,int s, int e){
        if(s>e){
            return true;
        }

        char temp1=str.charAt(s);
        char temp2=str.charAt(e);

        if(temp1!=temp2){
            return false;
        }

        return palindrome_check(str, s+1 ,e-1);


    }
}
