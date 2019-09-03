package devices;
import interfaces.Device;

public class Television implements Device {

    @Override
    public void switchOn() {
        System.out.println("The television switches on");
    }
    @Override
    public void switchOff() {
        System.out.println("The television switches off");
    }
    @Override
    public void volumeUp() {
        System.out.println("The television's volume goes up");
    }
    @Override
    public void volumeDown() {
        System.out.println("The television's volume goes down");
    }
}
