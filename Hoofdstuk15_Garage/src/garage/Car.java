package garage;

import enums.Color;
import interfaces.Moveable;
import interfaces.Paintable;

import java.util.Objects;
import java.util.UUID;

/**
 * Super- and abstract class Car
 * Pertains all necessary methods to modify Car objects *
 * @see Paintable
 * @see Moveable
 */

public abstract class Car implements Paintable, Moveable {
    private static int NUMBER_OF_WHEELS = 4;
    protected static int count;
    private Color color;
    private double speed;
    private String parkingSpot;
    private double weight;
    protected int chassisID;

    public Car() {
        this(null,0);
    }

    public Car(Color color) {
        this(color,0);
    }

    public Car(Color color, double weight){
        setColor(color);
        this.chassisID = generateChassisID();
        setWeight(weight);
        count++;
    }

    public Car buildCar(){
        return new Car(){};
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return (Double.compare(car.getSpeed(), this.getSpeed()) == 0) &&
                (this.getColor() == car.getColor());
    }

    @Override
    public int hashCode() {
        return (Objects.hash((getColor().getR()+getColor().getG()+getColor().getB()), getSpeed()))*23;
    }

    public void setColor(Color color) {
        try {
            this.color = color;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public void accelerate(double value) {
        setSpeed(this.speed + value);
    }

    @Override
    public void slowDown(double value) {
        setSpeed(this.speed - value);
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        try {
            this.speed = speed;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getCount() {
        return count;
    }

    public void rePaint(Color color) {
        setColor(color);
    }

    public String toString() {
        return this.toString() + " color: " + getColor();
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public int getChassisID() {
        return chassisID;
    }

    public int generateChassisID(){
        return UUID.randomUUID().hashCode();
    }
}
