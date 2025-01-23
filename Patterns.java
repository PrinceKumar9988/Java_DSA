public class Patterns {

    public static void main(String[] args) {

        // First 4 patterns are quite easy so I am starting from 5th Pattern:-

//        5.      *
//                **
//                ***
//                ****
//                *****
//                ****
//                ***
//                **
//                *
        int n=5;


        for (int i = 1; i <2*n; i++) {
            int stars=(i>5) ? (2*n-i) : i;
            for (int j = 1; j <=stars ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


         //                                    PATTERN 6

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j>n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }


//                                                 PATTERN 7:-

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i-1>=j){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }

            }
            System.out.println();

        }


//                                                      PATTERN 8

        for (int i = 0; i <n; i++) {
            for (int j = 1; j <=n+i ; j++) {
                if(j>=n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




//                                                         PATTERN 9


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=2*n-i ; j++) {
                if(i-1>=j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();

        }


//                                                       pattern 10

        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <=n+i ; j++) {
                if(j>=n-i){
                    if(i%2==0){
                        if(j%2==1){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }else {
                        if(j%2==0){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }

                    }

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


//                                                       PATTERN 11


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=2*n-i ; j++) {
                if(i-1>=j){
                    System.out.print(" ");
                }
                else{
                    if(i%2==1){
                        if(j%2==1){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }else {
                        if(j%2==0){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }

                    }
                }

            }
            System.out.println();
        }


        //                                            PATTERN 12


//                              To make pattern 12 combine pattern 11 and pattern 12



//                                                   PATTERN 13



    }
}
