package harbor;

import boat.Boat;
import interfaces.Moveable;

public class Dock {
    private int MAX;
    private String country;
    private static Moveable[] vehicles;
    private static Boat dockedBoat;

    public Dock(){
        this("");
    }

    public Dock(String country){
       this.country = country;
    }

}
