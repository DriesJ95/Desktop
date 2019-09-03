package opdracht2_interfaceImplementation;

public class CDPlayer implements Player {
    private boolean sound = false;


    @Override
    public void Play() {
        sound = true;
        System.out.println("CD is playing");
    }

    @Override
    public void Stop() {
        sound = false;
        System.out.println("CD stopped");
    }

    @Override
    public void Pause() {
        sound = false;
        System.out.println("CD paused");
    }

    @Override
    public void Reverse() {
        sound = true;
        System.out.println("Satanic jibber jabber resounds");

    }
}
