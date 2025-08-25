package OOPS5.Interfaces;

public class CD_Player implements MediaPlayer{

    public CD_Player() {
        super(); // Object class- Ftaher of all class
    }

    @Override
    public void start() {
        System.out.println("Start the media player");

    }

    @Override
    public void stop() {
        System.out.println("Stop the media player");


    }
}
