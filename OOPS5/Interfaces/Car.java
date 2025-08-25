package OOPS5.Interfaces;

public class Car implements Engine, Brake, MediaPlayer{

//    int a=5;

    @Override
    public void brake() {
        System.out.println("I brake like a Normal car");

    }

    @Override
    public void start() {
        System.out.println("My Engine start like a Normal car");


    }

    @Override
    public void stop() {
        System.out.println("My Engine stop like a Normal car");


    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a Normal car");


    }
}
