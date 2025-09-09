package OOPS7.enums;

public class Basic {




    enum Week implements A{ // enums can implement interfaces but cannot extend classes

        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;
        // These are enums constants
        // public, static and final
        // Since its final you cannot create child
        // Type is Week

        Week(){
            System.out.println("Constructor called for"+ this);
        }

        @Override
        public void hello() {
            System.out.println("Hi There");
        }

        // this is not public or protected , only private or default
        // why? bcs we donot want to create new objects
        // this is not enums concept thats why

        // internally: public static final Week Monday= new Week();



    }





    public static void main(String[] args) {

        Week week= Week.Tuesday;
        System.out.println(week);
//        System.out.println(week.ordinal());
//
//        for (Week day: Week.values()){
//            System.out.println(day);
//        }
        week.hello();
    }
}
