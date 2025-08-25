package OOPS5.Interfaces;

public class Main {
    public static void main(String[] args) {

        Car c= new Car();

//        Engine c1= new Car();  /// you can do this here
//        System.out.println(c.a);
//
//        c.acc();
//        c.brake();
//        c.start();
//        c.stop();

        MediaPlayer carMP= new Car();
        carMP.start();// On using both of these methods I want to off start or stop media player but it is stopping engine so for this we can make different classes like CD-player and implement  MediaPlayer there as follow.
        carMP.stop();

        CD_Player cd= new CD_Player();// CD_Player class & MediaPlayer Instance

        cd.start();
        cd.stop();

        PowerEngine pe= new PowerEngine();// PowerEngine class and Engine Instance
        pe.acc();
        pe.start();
        pe.stop();

        NiceCar nc= new NiceCar(); // Now both engine and music will start seprately.
        nc.start_music();
        nc.starts();



    }
}
