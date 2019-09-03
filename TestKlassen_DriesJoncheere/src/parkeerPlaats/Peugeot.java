package parkeerPlaats;

public class Peugeot extends Auto{
    private final String FUELTYPE = "BENZINE";
    public Peugeot (double weight){
        super("Peugeot",weight);
    }
    public void FuelUp(){
        System.out.println("You fill up your Peugeot with BENZINE");
    }

    public void getFUELTYPE(){
        System.out.println("This car runs on: " + FUELTYPE);
    }
}
