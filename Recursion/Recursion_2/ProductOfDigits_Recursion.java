package Recursion.Recursion_2;

public class ProductOfDigits_Recursion{
    public static void main(String[] args) {
        System.out.println(Productdigit(1234));
    }

    static int Productdigit(int n){

        if(n%10==n){
            return n;
        }

//        int temp=n%10;
//        return sumdigit(n/10)+temp;
        return (n%10) * Productdigit(n/10);

    }
}
