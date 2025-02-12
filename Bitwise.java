public class Bitwise {
    public static void main(String[] args) {

        // Ques: Swap two numbers with the help of bitwise XOR operator:-

        int a2=5;
        int b2=7;

        a2=a2^b2;
        b2=a2^b2;
        a2=a2^b2;
        System.out.println(a2);
        System.out.println(b2);



        // Ques:-to find if number is odd or even:-

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



        // Ques:-find ith bit of a number:-

        int p=76;
        System.out.println(Integer.toBinaryString(76));
        int i=4;

        System.out.println(p>>(i-1)&1);



        // Ques:-Set ith bit:- if the bit is 0 make it 1 and if bit is 1 let it be 1



        i=5;
        System.out.println(p|(1<<4));

        // reset ith bit:- if bit is 1 make it 0 and if it is 0 then let it be 0.
        // 4th bit

        System.out.println(p^(1<<3));


        //Ques:- Find the position of rightmost bit:-

        // there r two ways of doing this question

        // 1st

        int k=80;
        System.out.println(Integer.toBinaryString(k));
        int count=0;
        while (k>0){
            if((k&1)==1){
                count++;
                break;
            }else{
                count++;
            }
            k=k>>1;
        }
        System.out.println(count);

        // 2nd: More efficient:-
         int t=80;
        System.out.println(t & -t);


        //Ques:-  find -ve of number:- 2's complememnt.i.e. ~p then add 1 to it , u will get -ve of number.

//        - signed:- 256 different values will be stored , signed range of 1 byte is from  -128 to 127
//        and for unsigned it is from 0 to 255



        // Ques:-  If arr[] is given and every item is repeating 3 times and only 1 element is repeating one time , then Find the elemeent repeating one time

        int[] arr2={2,2,1,2,7,7,8,7,8,8};
        int ones=0; int twos=0;

        for(int ele : arr2){
            ones=(ones^ele) & ~twos;
            twos=(twos^ele) & ~ones;
        }

        System.out.println(ones);


        // find nth magic number:-

        int n1=4;
        int base=5;
        int ans1=0;

        while(n1>0){
            if((n1&1)==1){
                ans1=ans1+base;
            }
            n1=n1>>1;
            base*=5;

        }
        System.out.println(ans1);



//        Ques:- Find the no.of digits in base b

//        logbase(2)10

        int a=10;
        int b=2;

        System.out.println((int)(Math.log(a)/Math.log(b)+1));



//        ques: find sum of nth row of pascal traingle

//        pascal traingle:-


//        1
//        1   1
//        1   2   1
//        1   3   3  1
//        1   4   6  4  1
//        1   5  10  10 5  1
        int g=6;


        System.out.println((1<<(g-1)));


        // ques:- Given a number find if its power of 2 or not:
        // there r 3 ways to do it

//        1st

        int o=16;
        int count1=0;

        while(o>0){
            o-=o & -o;
            count1++;
        }

        if(count1==1){
            System.out.println("It is power of 2");
        } else {
            System.out.println("It is not power of 2");
        }

//        2nd way

        int h=16;


        if(((h & (h-1))==0)){        // syntav problem.
            System.out.println("it is power of 2");
        }else{
            System.out.println("It is not power of 2");
        }

//        3rd way

//        keep dividing the number by 2 and if u get any odd number then it is not power of 2 else it is power of 2


//        ques: Find if number is power of 3 or not


        int z=27;
        if(z%3!=0){
            System.out.println("Not a power of 3");
        }
        while(z%3==0){
            z=z/3;
        }
        if(z==1){
            System.out.println("It is a power of 3");
        } else{
            System.out.println("It is not power of 3");

       }

//        Ques:- find the power of b raise to power a;

        int base1=6;
        int power=3;
        int ans3=1;

        // here I have to find that what is 3 raise to power 6;

        while(power>0){
            if((power&1)==1){
                ans3*=base1;
            }
            power>>=1;
            base1*=base1;

        }
        System.out.println(ans3);

//        Find the number of set bits in a number:-

        int n3=10;
        int calculate=0;

        while(n3>0){
            n3-= (n3 & -n3);
            calculate++;
            n3>>=1;

        }
        System.out.println(calculate);



//        Find  the XOR of numbers from 0 to a:

//        0^0=0
//        0^1=1
//        0^1^2=3
//        0^1^2^3=0
//        0^1^2^3^4=4
//        0^1^2^3^4^5=1
//        0^1^2^3^4^5^6=7;
//        0^1^2^3^4^5^6^7=0
//        0^1^2^3^4^5^6^7^8=8;
//        0^1^2^3^4^5^6^7^8^9=1


//                Some Observations from the above XOR are as follow:-


//        a%4=0     a
//        a%4=1     1
//        a%4=2     a+1
//        a%4=3      0


//         Using the above observations u can easily find out the XOR of number from 0 to 1,
//        But if you have to find the XOR of the number from a to b, then first find XOR of the numbers from 0 to b then
//        XOR with (a-1) bcs XOR of same numbers will be removed.





    }
}
