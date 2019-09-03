package parkeerPlaats;

public abstract class Auto {
    private String merkNaam;
    private double weight;
    private final String FUELTYPE = "Type Brandstof";

    public Auto(){
        this("",0);
    }

    public Auto(String merkNaam){
        this(merkNaam,0);
    }

    public Auto(String merkNaam, double weight){
        setMerkNaam(merkNaam);
        setWeight(weight);
    }

    public Auto(Auto auto){
        this(auto.getMerkNaam(),auto.getWeight());
    }

    public String getMerkNaam() {
        return merkNaam;
    }

    public void setMerkNaam(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void FuelUp();

    public abstract void getFUELTYPE();

    @Override
    public String toString(){
        return "| " + this.getMerkNaam() + " " + this.getWeight() + " | ";
    }
}
