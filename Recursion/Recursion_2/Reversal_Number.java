package Recursion.Recursion_2;

public class Reversal_Number {
    public static void main(String[] args) {

        int n=1234;
        int ans=0;
//        int mul=1;
        System.out.println(reverse_recursion(n,ans));

    }

    static  int reverse_recursion(int n,int ans){

        if(n==0){
            return ans;
        }
        ans=(ans*10)+n%10;  // correct
//        ans=ans+(n%10); // uncorrect

        return reverse_recursion(n/10,ans*10);

    }

}
