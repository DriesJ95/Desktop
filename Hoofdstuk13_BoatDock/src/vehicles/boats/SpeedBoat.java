package vehicles.boats;

import vehicles.boats.Boat;

public class SpeedBoat extends Boat {
    public int horsePower;

    public SpeedBoat(){
        this("",0,0,0);
    }

    public SpeedBoat(String name, double weight, double topSpeed, int horsePower){
        super(name,weight,topSpeed);
        this.setHorsePower(horsePower);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void accelerate(){
        System.out.println("The " + getName() + " soars off!");
    }

    public String toString(){
        return super.toString() + "\nSpecific attribute: " + this.getHorsePower() + "HP";
}
}
