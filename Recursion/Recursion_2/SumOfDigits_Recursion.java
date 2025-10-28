package Recursion.Recursion_2;

public class SumOfDigits_Recursion {
    public static void main(String[] args) {
        System.out.println(sumdigit(1234));
    }

    static int sumdigit(int n){

        if(n==0){
            return 0;
        }

//        int temp=n%10;
//        return sumdigit(n/10)+temp;
        return (n%10) + sumdigit(n/10);

    }
}
