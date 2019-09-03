package vehicles.boats;

import vehicles.boats.Boat;

public class SailBoat extends Boat {
    public double sailSize;

    public SailBoat(String name, double weight, double topSpeed, double sailSize){
        super(name,weight,topSpeed);
        this.setSailSize(sailSize);
    }
    public SailBoat(){
        this("",0,0,0);
    }

    public double getSailSize() {
        return sailSize;
    }

    public void setSailSize(double sailSize) {
        this.sailSize = sailSize;
    }

    public void accelerate(){
        System.out.println("The sailboat's sails catch wind and it starts speeding up");
    }

    public String toString(){
        return super.toString() + "\nSpecific attribute: " + this.getSailSize() + "M²";
    }
}
