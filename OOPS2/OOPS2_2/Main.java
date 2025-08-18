package OOPS2.OOPS2_2;

public class Main {
    public static void main(String[] args) {

        Human prince= new Human(22,"prince",500000,false);
        Human prince1= new Human(25,"prince",5000000,false);
        Human prince11= new Human(25,"prince",5000000,false);


        System.out.println(prince.age);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main obj= new Main();

        obj.greeting();

        name();


    }
    // Something which is non-static belongs to object thats why u cannot call something non-static from static
    static void name(){
        Main obj= new Main(); // to call greeting() method, you have to either make greeting static or make an object for it.
        obj.greeting();

        System.out.println("Helio G96");
        // You cannot call something non-static from a static block but vice and versa is possible.i.e. (You can call something static from non-static block)


    }


    void greeting(){
        System.out.println("Namaste");

    }
}


//NOTE:-  YO CAN CALL STATIC FROM STATIC, STATIC FROM NON STATIC, NON STATIC FROM NON STATIC BUT NOT NON STATIC FROM STATIC.
