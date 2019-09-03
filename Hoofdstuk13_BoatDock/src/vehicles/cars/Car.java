package vehicles.cars;

import enums.*;
import interfaces.Drivable;
import people.Person;
import vehicles.Vehicle;


public class Car extends Vehicle implements Drivable {
    private int horsePower;
    private BrandType brandType;
    private int maxSpeed;
    private Person owner;
    private FuelType fuelType;
    private double fuelUsage;
    private double maxFuel;

    public Car(int horsePower, BrandType brandType, int maxSpeed, Person owner, FuelType fuelType, double fuelUsage, double maxFuel) {
        this.horsePower = horsePower;
        this.brandType = brandType;
        this.maxSpeed = maxSpeed;
        this.owner = owner;
        this.fuelType = fuelType;
        this.fuelUsage = fuelUsage;
        this.maxFuel = maxFuel;
    }

    @Override
    public void drive() {
        System.out.println("The wheels on the car turn round 'n round");
    }

    @Override
    public void move() {
        System.out.println("The cars starts moving");
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "HP:" + horsePower +
                ", Brand:" + brandType +
                ", maxSpeed:" + maxSpeed +
                ", Owner:" + owner +
                ", FuelType:" + fuelType +
                ", FuelUsage:" + fuelUsage +
                ", MaxFuelCapacity:" + maxFuel +
                '}';
    }
}
