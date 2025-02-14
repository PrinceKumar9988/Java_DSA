public class tryy {
    public static void main(String[] args) {
        int n=5;
//        for (int i = 0; i <n ; i++) {
//            for (int j = 1; j <=n+i ; j++) {
//                if(j>=n-i){
//                    if(i%2==0){
//                        if(j%2==1){
//                            System.out.print("*");
//                        }
//                        else{
//                            System.out.print(" ");
//                        }
//
//                    }else {
//                        if(j%2==0){
//                            System.out.print("*");
//                        }
//                        else {
//                            System.out.print(" ");
//                        }
//
//                    }
//
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        int p=86;

        System.out.println((p>>4)&1);

        System.out.println(p|(1<<3));

        System.out.println(p&(~(1<<4)));
        System.out.println(p^(1<<4));
        System.out.println(1<<0);

        for (int i = 1; i <0 ; i++) {
            System.out.println(i);

        }







    }
}
