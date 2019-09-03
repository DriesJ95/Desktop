package vehicles.boats;
import vehicles.cars.Car;

import java.util.Arrays;

public class CarBoat extends Boat {
    public int capacity;
    public Car[] cars = new Car[0];

    public CarBoat(){
        this("",0,0,0);
    }

    public CarBoat(String name, double weight, double topSpeed, int capacity){
        super(name,weight,topSpeed);
        setCapacity(capacity);
    }

    public void accelerate(){
        System.out.println("The " + getName() + " slowly accelerates");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        Car[] temp = new Car[cars.length+1];
        for (int i = 0; i < cars.length; i++){
            temp[i] = cars[i];
        }
        temp[temp.length-1] = car;
        cars = temp;
    }

    public String toString(){
        return super.toString() + "\nIt currently has " + cars.length + " cars on board:\n" + Arrays.toString(cars);
    }
}
