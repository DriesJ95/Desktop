package parkeerPlaats;

public class Audi extends Auto {

    private final String FUELTYPE = "DIESEL";

    public Audi(double weight){
        super("Audi",weight);
    }

    public void FuelUp(){
        System.out.println("You fill up your Audi with DIESEL");
    }

    public void getFUELTYPE(){
        System.out.println("This car runs on: " + FUELTYPE);
    }
}
