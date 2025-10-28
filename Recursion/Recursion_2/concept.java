package Recursion.Recursion_2;

public class concept{
    public static void main(String[] args) {

        fun(5);

    }
    static void fun(int n){
        
        if(n==0){
            return;
        }

        fun(n--);// It will lead to stack overflow


    }
}
