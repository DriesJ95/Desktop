package boat;

import exceptions.BoatFullException;
import exceptions.BoatOverLoadException;
import garage.Car;

public class CarBoat extends Boat {

    private int maxVehicle;
    private int maxLoad;
    private int currentLoad;
    private Car[] cars;

    public CarBoat() {
        this("", 0, 0, 0);
    }

    public CarBoat(String city, int number, int maxVehicle, int maxLoad) {
        super(city, number);
        setMaxVehicle(maxVehicle);
        setMaxLoad(maxLoad);
        cars = new Car[maxVehicle];
        this.currentLoad = 0;
    }

    public Car[] getBoatContent(){
        return cars;
    }

    public void addCarToBoat(Car car) throws Exception {
        if (isBoatFull()){
            throw new BoatFullException();
        }
        if (isTooHeavy()) {
            throw new BoatOverLoadException();
        }
        for (int i = 0; i < cars.length; i++) {
            try {
                if (cars[i] == null) {
                    cars[i] = car;
                    break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        this.currentLoad += car.getWeight();
    }

    private boolean isBoatFull(){
        int counter = 0;
        for (Car c : cars){
            if (c == null){
                counter ++;
            }
        }
        if (counter > 0){
            return false;
        }else{
            return true;
        }
    }

    private boolean isTooHeavy() throws Exception {
        if (currentLoad >= maxLoad){
            return true;
        }else{
            return false;
        }
    }

    public int getMaxVehicle() {
        return maxVehicle;
    }

    public void setMaxVehicle(int maxVehicle) {
        this.maxVehicle = maxVehicle;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getTotalCars(){
        int counter = 0;
        for (Car c : cars){
            if (c != null){
                counter++;
            }
        }
        return counter;
    }

    public void printBoat() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("THE BOAT CONTAINS THE FOLLOWING CARS:");
        String output = "";
        for (int i = 1; i < cars.length + 1; i++) {
            if (cars[i-1] != null) {
                String formatted = String.format("||%-40s || ",cars[i - 1].toString());
                output = output.concat(formatted);

                if (i % 3 == 0) {
                    output = output.concat("\n");
                }
            }else{
                String formatted = String.format("||%-40s || ", "" + null);
                output = output.concat(formatted);

                if (i % 3 == 0) {
                    output = output.concat("\n");
                }
            }
        }
        System.out.printf("%s ", output);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("There are " + getTotalCars() + " cars on this ship for a total weight of " + currentLoad + " kg");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");

    }
}
