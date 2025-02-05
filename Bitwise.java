public class Bitwise {
    public static void main(String[] args) {


        // to find if number is odd or even:-

        int n=11;

        if((n&1)==1){
            System.out.println("the number is odd");
        } else{
            System.out.println("the number is even");
        }

        // Ques:- Let's say if arr is given in which all the number are appearing twicw and only 1 number appears once, fing the number thaat appears once

        int[] arr={1,2,3,4,1,3,4}; // a^a=0
        int ans=arr[0];

        for (int i = 1; i <arr.length ; i++) {
            ans^=arr[i];
        }
        System.out.println(ans);

        // find ith bit of a number:-

        int p=76;
        System.out.println(Integer.toBinaryString(76));
        int i=4;

        System.out.println(p>>(i-1)&1);

        // Set ith bit:-

        i=5;
        System.out.println(p|(1<<4));

        // reset ith bit:-




    }
}
