package devices;

import interfaces.Command;
import interfaces.Device;

public class SwitchOn implements Command {

    @Override
    public void execute() {

    }

    public SwitchOn(Device device){
        device.switchOn();
    }
}
