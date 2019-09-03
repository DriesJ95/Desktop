package parkeerPlaats;

public class BMW extends Auto {

    private final String FUELTYPE = "DIESEL";

    public BMW(double weight){
        super("BMW",weight);
    }

    public void FuelUp(){
        System.out.println("You fill up your BMW with DIESEL");
    }

    public void getFUELTYPE(){
        System.out.println("This car runs on: " + FUELTYPE);
    }
}
