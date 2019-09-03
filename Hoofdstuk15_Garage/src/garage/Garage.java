package garage;
import exceptions.GarageFullException;
import exceptions.VehicleAlreadyInGarageException;
import interfaces.Moveable;

/**
 * Garage class holds an array of Moveable_objects, a MAX capacity integer
  and a counter integer that'll remember the amount of Garage objects instantiated.
 * @author Dries Joncheere
 * @version 1.0.1
 */

public class Garage {
    private static int MAX;
    private Moveable[] vehicles;
    private static int counter;

    /**Constructs a Garage_object
     * @param max sets the static int MAX (max capacity of the garage)
     */
    public Garage(int max){
        this.MAX = max;
        vehicles = new Moveable[max];
        counter++;
    }
    /**
     * Adds a Moveable_object to the Garage_object
     * @throws VehicleAlreadyInGarageException throws new Exception when the given car is already in the garage
     * @throws GarageFullException throws new Exception when the garage is already full
     * @param car Moveable_object
     */
    public void addVehicle(Moveable car) throws Exception {
        if (isVehiclePresent(car)){
            throw new VehicleAlreadyInGarageException();
        }
        if (nextFreePosition() == vehicles.length) {
            throw new GarageFullException();
        }else{
            vehicles[nextFreePosition()] = car;
        }
    }
    /**
     * Checks whether or not the Moveable_object is already in the Garage_object
     * @param car Moveable_object
     */
    private boolean isVehiclePresent(Moveable car){
        boolean present = false;
        for (Moveable m : vehicles){
            if (m != null){
                if (m.equals(car)){
                    present = true;
                }
            }
        }
        return present;
    }

    /**
     * @return Moveable[] vehicles
     */
    public Moveable[] getVehicles(){
        return vehicles;
    }

    /**
     * Returns the next free position in the Garage_object
     * @return the next free position (index)
     */
    private int nextFreePosition(){
        int counter = 0;
        for (Moveable m : vehicles){
            if(m == null){
                return counter;
            }
            counter++;
        }
        return counter;
    }

    /**
     * Removes the given Moveable_object from the Garage_object
     * @param car Moveable_object
     */
    public void removeVehicle(Moveable car){
        Moveable[] temp = new Moveable[vehicles.length-1];
        boolean alreadyRemoved =false;
        for (int i = 0; i < temp.length; i++){
            if (vehicles[i].equals(car) || alreadyRemoved == true){
                temp[i] = vehicles[i+1];
                alreadyRemoved = true;
            }else{
                temp[i] = vehicles[i];
            }
        }
    }

    /**
     * Get Car_object at given index
     * @param index integer index points to the position in the Moveable[] vehicles
     * @return Car_object at given index
     */
    public Car getVehicleAtIndex(int index){
        return (Car)vehicles[index];
    }

    /**
     * Clears the Garage_object
     */
    public void clear(){
        vehicles = new Moveable[vehicles.length];
    }

    /**
     * Returns size of the garage
     * @return length of the Moveable[] vehicles
     */
    public int getSize(){
        return vehicles.length;
    }

    /**
     * Prints out the Garage lay-out
     */
    public void printGarage(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("THE GARAGE CONTAINS THE FOLLOWING CARS:");
        String output = "";
        for (int i = 1; i < vehicles.length + 1; i++) {
            output = output.concat(vehicles[i - 1].toString());
            if (i % 3 == 0){
                output = output.concat("\n");
            }
        }
        System.out.println(output);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("There are " + SportCar.getCount() + " sport cars of which " + Cabriolet.getCount() + " are cabriolets");
        System.out.println("There are " + FamilyCar.getCount() + " family cars");
        System.out.println("The garage's total number of cars is " + this.getSize());
        System.out.println("-----------------------------------------------------------------------------------");

    }

}
