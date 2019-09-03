package vehicles.boats;

import interfaces.Floatable;
import vehicles.Vehicle;
import people.Captain;

public abstract class Boat extends Vehicle implements Floatable {
    private double weight;
    private double topSpeed;
    private String name;
    private Captain captain;

    public Boat(String name, double weight, double topSpeed){
        setName(name);
        setWeight(weight);
        setTopSpeed(topSpeed);
    }

    @Override
    public void Float(){
        System.out.println("All boats float unless damaged");
    }
    @Override
    public void move(){
        System.out.println("The boat can be moved over water or over land with the help of a crane");
    }

    public abstract void accelerate();

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "The " + this.getName() + " with a weight of " + this.getWeight() + "KG, has a topspeed of " + this.getTopSpeed() + "KM/H";
    }
}
