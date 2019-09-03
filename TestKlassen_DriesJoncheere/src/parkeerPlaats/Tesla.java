package parkeerPlaats;

public class Tesla extends Auto {

    private final String FUELTYPE = "BATTERY";

    public Tesla(double weight){
        super("Tesla",weight);
    }

    public void FuelUp(){
        System.out.println("You charge your Tesla's BATTERY, it takes forever");
    }

    public void getFUELTYPE(){
        System.out.println("This car runs on: " + FUELTYPE);
    }
}
