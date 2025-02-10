public class Maths {
    public static void main(String[] args) {


//        int n=40;
//        double root=0.0;
//        double inc=0.1;
//        for (int i = 0; i <3; i++) {
//            while(root*root<=n){
//                root+=inc;
//            }
//            root-=inc;
//            inc/=10;
//        }
//        System.out.println(root);
//        System.out.println(Math.sqrt(40));

        // Prime Number:-Number that is divisible by 1 and number itself.

        // there are 3 ways to find prime number

        // 1st way:-

        int n=50;
        boolean isPrime=true;

        for (int i = 2; i <n ; i++) {
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
        //TC IS O(n)

        // 2nd way:- It been observed that if number is large then looking for the n%i after the square root of number leads to its repeatition.


        boolean prime=true;
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0){
                prime=false;
            }
        }
        System.out.println(prime);

        // TC IS O(SQRT(N))

        // 3rd way: SEIVE OF ERATOSTHENESIS:

        int m=40;
        boolean [] arr= new boolean[m+1];
        for (int i = 2; i*i <=m ; i++) {
            if(!arr[i]){
                for (int j = i*2; j <=arr.length ; j+=i) {
                    arr[j]=true;

                }
            }

        }
        for (int i = 2; i <arr.length ; i++) {
            if(!arr[i]){
                System.out.println(i);
            }
        }

//        TC IS  O(N*log(log N))


        // Square Root of the number:-



//        There are two ways of finding square root of the number:-

//        for perfect square numbers:


        int l=49;

        int start=0;
        int end=l;
        boolean bool=false;
        int mid=0;


        while (start<=end){
            mid=start+(end-start)/2;

            if(mid*mid==l){
                System.out.println(mid);
                bool=true;
                break;
            }
            if(mid*mid>l){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }

        // for non-perfect square numbers:-

        int precision=3;
        int l1=48;

        double root=0.0;
        double increment=0.1;

        for (int i = 1; i <=precision; i++) {
            while(root*root<l1){
                root+=increment;
            }
            root-=increment;
            increment/=10;
        }

        System.out.println(root);


        // Another way to find square root is newton raphson method

        // NEWTON RAPHSON:-
        int r=50;
        double root1;
        double x=r;

        while(true){
            root1=0.5*(x+(r/x));
            if(Math.abs((root1-x))<0.1){
                break;
            }
            x=root1;
        }
        System.out.println(root1);

        // Factors of the number:-

        int fact=30;
        for (int i=1;i<=Math.sqrt(fact);i++){
            if(fact%i==0){
                if(fact%i==i){
                System.out.println(i+" ");

            }
                else{
                    System.out.println(i+" "+fact/i+" ");
                }

            }
        }

        // HCF/gcd OF NUMBERS:- USING EUCLIDS ALGORITHM(DIE HARD EXAMPLE):-


        int a=4;
        int b=5;
        System.out.println(hcf(a,b));

        // LCM OF THE NUMBER:-
//        LCM*HCF=A*B(PRODUCT OF TWO NUMBERS);

        int c=4;
        int d=5;

        System.out.println((c*d)/hcf(c,d));


    }

    static int hcf(int a,int b){

        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }

}
