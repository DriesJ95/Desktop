package autoOef;
import java.util.Arrays;

public class Car {
    private Engine engine = new Engine();
    private Passenger [] passengers = new Passenger[0];
    private Passenger eddy = new Passenger("Eddy");
    private FuelTank tank = new FuelTank();
    private int topSpeed = 220;
    private int passengerCap = 5;

    public Car (Passenger owner, Engine engine, FuelTank tank){
        this.addPassenger("owner");
        this.engine = engine;
        this.tank = tank;
    }
    public Car (){
        this (null, new Engine(), new FuelTank());
    }

    public float getMaxFuelCapacity(){
        return this.tank.maxFuelCapacity;
    }

    public int getPassengerCapacity(){
        return passengerCap - Passenger.nrPassengers;
    }

    public int getTopSpeed(){
        return topSpeed;
    }

    public void reFuel(float gas){
        this.tank.addFuel(gas);
    }

    public void addPassenger(String passengerName){
        Passenger [] temp = new Passenger[this.passengers.length+1];
        for (int i = 0; i < passengers.length-1; i++){
            temp[i] = this.passengers[i];
        }
        temp[passengers.length] = new Passenger(passengerName);
        passengers = temp;
    }

    public void removePassenger(String passengerName){
        Passenger [] temp = new Passenger [passengers.length-1];
        for (int i = 0; i < passengers.length-1; i++){
            temp[i] = this.passengers[i];
        }
        passengers = temp;
    }

    public void startCar(){
        this.engine.startEngine();
    }

    public void stopCar(){
        this.engine.stopEngine();
    }

    public String autoToString(){
        return "This car's top speed is " + this.getTopSpeed() + " and has a fueltank with capacity " + this.getMaxFuelCapacity() + " and is carrying these passengers: " + Arrays.toString(passengers);
    }
}
