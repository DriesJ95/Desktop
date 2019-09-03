package parkeerPlaats;

public class Porsche extends Auto {

    private final String FUELTYPE = "BENZINE";

    public Porsche(double weight){
        super("Porsche",weight);
    }

    public void FuelUp(){
        System.out.println("You fill up your Porsche with BENZINE");
    }

    public void getFUELTYPE(){
        System.out.println("This car runs on: " + FUELTYPE);
    }
}
