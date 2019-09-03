package garage;

import enums.Color;
import exceptions.GarageFullException;
import exceptions.VehicleAlreadyInGarageException;
import interfaces.Moveable;

import java.util.Random;

public class ProtoGarage {
    private static int MAX;
    private Moveable[] vehicles;
    private static int counter;

    private class ProtoCar extends Car {
        public boolean wrapped;

        public ProtoCar(Color color) {
            super(color);
        }

        public void protectProto() {
            wrapped = true;
        }

        public void unprotectProto() {
            wrapped = false;
        }

        public String protectionState(){
            if (wrapped){
                return "Wrapped";
            }else{
                return "Not wrapped";
            }
        }

        public String toString() {
            return "|Prototype: RGB " + getColor().name().toLowerCase() + ", speed " + getSpeed() + "km/h " + protectionState() + "|";
        }


    }

    public Moveable[] protoCars(int amount) {
        Random rand = new Random();
        Moveable[] temp = new Moveable[amount];
        for (int i = 0; i < amount; i++) {
            ProtoCar auto = new ProtoCar(Color.WHITE);
            auto.setSpeed(rand.nextInt(290)+110);
            switch (rand.nextInt(2)) {
                case 0:
                    auto.protectProto();
                    break;
                case 1:
                    auto.unprotectProto();
                    break;
            }
            temp[i] = auto;
        }
        return temp;
    }

    /**
     * Constructs a Garage_object
     *
     * @param max sets the static int MAX (max capacity of the garage)
     */
    public ProtoGarage(int max) {
        this.MAX = max;
        vehicles = new Moveable[max];
        counter++;
    }

    public void setVehicles(Moveable[] carArray){
        this.vehicles = carArray;
    }

    /**
     * Adds a Moveable_object to the Garage_object
     *
     * @param car Moveable_object
     * @throws VehicleAlreadyInGarageException throws new Exception when the given car is already in the garage
     * @throws GarageFullException             throws new Exception when the garage is already full
     */
    public void addVehicle(Moveable car) throws Exception {
        if (isVehiclePresent(car)) {
            throw new VehicleAlreadyInGarageException();
        }
        if (nextFreePosition() == vehicles.length) {
            throw new GarageFullException();
        } else {
            vehicles[nextFreePosition()] = car;
        }
    }

    /**
     * Checks whether or not the Moveable_object is already in the Garage_object
     *
     * @param car Moveable_object
     */
    private boolean isVehiclePresent(Moveable car) {
        boolean present = false;
        for (Moveable m : vehicles) {
            if (m != null) {
                if (m.equals(car)) {
                    present = true;
                }
            }
        }
        return present;
    }

    /**
     * @return Moveable[] vehicles
     */
    public Moveable[] getVehicles() {
        return vehicles;
    }

    /**
     * Returns the next free position in the Garage_object
     *
     * @return the next free position (index)
     */
    private int nextFreePosition() {
        int counter = 0;
        for (Moveable m : vehicles) {
            if (m == null) {
                return counter;
            }
            counter++;
        }
        return counter;
    }

    /**
     * Removes the given Moveable_object from the Garage_object
     *
     * @param car Moveable_object
     */
    public void removeVehicle(Moveable car) {
        Moveable[] temp = new Moveable[vehicles.length - 1];
        boolean alreadyRemoved = false;
        for (int i = 0; i < temp.length; i++) {
            if (vehicles[i].equals(car) || alreadyRemoved == true) {
                temp[i] = vehicles[i + 1];
                alreadyRemoved = true;
            } else {
                temp[i] = vehicles[i];
            }
        }
    }

    /**
     * Get Car_object at given index
     *
     * @param index integer index points to the position in the Moveable[] vehicles
     * @return Car_object at given index
     */
    public Car getVehicleAtIndex(int index) {
        return (Car) vehicles[index];
    }

    /**
     * Clears the Garage_object
     */
    public void clear() {
        vehicles = new Moveable[vehicles.length];
    }

    /**
     * Returns size of the garage
     *
     * @return length of the Moveable[] vehicles
     */
    public int getSize() {
        return vehicles.length;
    }

    /**
     * Prints out the Garage lay-out
     */
    public void printGarage() {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("THE GARAGE CONTAINS THE FOLLOWING CARS:");
        String output = "";
        for (int i = 1; i < vehicles.length + 1; i++) {
            output = output.concat(vehicles[i - 1].toString());
            if (i % 2 == 0) {
                output = output.concat("\n");
            }
        }
        System.out.println(output);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("There are " + ProtoCar.getCount() + " prototype cars");
        System.out.println("The garage's total number of cars is " + this.getSize());
        System.out.println("-----------------------------------------------------------------------------------");

    }
}
