package opdracht_CarUML;

public class Car {
    private int horsePower;
    private BrandType brand;
    private int maxSpeed;
    private Person owner;
    private FuelType fuel;
    private double fuelUsage;
    private double maxFuel;

    public Car(int horsePower, BrandType brand, int maxSpeed, Person owner, FuelType fuel, double fuelUsage, double maxFuel) {
        setHorsePower(horsePower);
        setBrand(brand);
        setMaxSpeed(maxSpeed);
        setOwner(owner);
        setFuel(fuel);
        setFuelUsage(fuelUsage);
        setMaxFuel(maxFuel);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public BrandType getBrand() {
        return brand;
    }

    public void setBrand(BrandType brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    @Override
    public String toString() {
        String output = "This " + this.getBrand() + " belongs to " + this.getOwner() + ", has " + this.getHorsePower()
                + "HP, and a topspeed of " + this.getMaxSpeed() + ".  \nThis car runs on " + this.getFuel();
        if (this.getFuel().equals(FuelType.Diesel)) {
            output = output.concat(" has a fuel capacity of "
                    + this.getMaxFuel() + " liters and uses " + this.getFuelUsage() + " liters/100KM");
        } else if (this.getFuel().equals(FuelType.Electric)) {
            output = output.concat(" has a battery capacity of "
                    + this.getMaxFuel() + "W/h and uses " + this.getFuelUsage() + "W/h fluctuating based on speed");
        } else if (this.getFuel().equals(FuelType.Gas)) {
            output = output.concat(" has a fuel capacity of "
                    + this.getMaxFuel() + " liters and uses " + this.getFuelUsage() + " liters/100KM");
        } else if (this.getFuel().equals(FuelType.Petrol)) {
            output = output.concat(" has a fuel capacity of "
                    + this.getMaxFuel() + " liters and uses " + this.getFuelUsage() + " liters/100KM");
        }
        return output;
    }
}

