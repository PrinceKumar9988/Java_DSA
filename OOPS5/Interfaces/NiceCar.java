package OOPS5.Interfaces;

public class NiceCar {


    private Engine engine;
    private CD_Player music;
    private BrakeClass Car_brake;

    public NiceCar(){
        engine=new PowerEngine();
         music= new CD_Player();
        Car_brake= new BrakeClass();

    }

    public NiceCar(Engine other){
        this.engine= other;
    }

    public void starts(){
        engine.start();
    }

    public void stops(){
        engine.stop();
    }

    public void start_music(){
        music.start();
    }

    public void stop_music(){
        music.stop();
    }

    public void apply_brakes(){
        Car_brake.brake();
    }


}
