package Recursion.Recursion_2;

public class N_to_1 {
    public static void main(String[] args) {

        num(5);
    }

    static void num(int n){
        if(n==0){
            return;

        }

//        System.out.println(n);  // n to 1
        num(n-1);
        System.out.println(n); // 1 to n


    }
}
