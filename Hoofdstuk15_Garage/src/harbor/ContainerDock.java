package harbor;

import boat.ContainerBoat;

public class ContainerDock extends Dock {
    private int MAX;
    private String country;
    private ContainerBoat boat;

    public ContainerDock(){
        this(0);
    }

    public ContainerDock(int max){
        this.MAX = max;
    }
}
