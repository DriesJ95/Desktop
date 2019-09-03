package people;

import vehicles.boats.Boat;

public class Captain extends Person{
    private Boat boat;

    public Captain(String name, int age){
        super(name,age);
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }
}
