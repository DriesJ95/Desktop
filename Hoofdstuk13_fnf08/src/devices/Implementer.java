package devices;
import controller.InfraredRemote;
import interfaces.Command;

public class Implementer {
    private Command powerOn;
    private Command powerOff;
    private Command volumeUp;
    private Command volumeDown;

    public Implementer(){}

    public static void main(String[] args) {
        Television tv = new Television();
        InfraredRemote remote = new InfraredRemote();

    }

    public static void run(){}

    public static void configureCommands(){}
}
