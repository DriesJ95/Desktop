public class CDPlayer implements Player {
    private boolean sound = false;


    @Override
    public void play() {
        sound = true;
        System.out.println("CD is playing");
    }

    @Override
    public void stop() {
        sound = false;
        System.out.println("CD stopped");
    }

    @Override
    public void pause() {
        sound = false;
        System.out.println("CD paused");
    }

    @Override
    public void reverse() {
        sound = true;
        System.out.println("Satanic jibber jabber resounds");

    }

    @Override
    public void eject(){
        sound = false;
        System.out.println("CD ejected from CD player");
    }
}
