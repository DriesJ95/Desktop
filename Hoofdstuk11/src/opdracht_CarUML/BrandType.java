package opdracht_CarUML;

public enum BrandType {
    Audi(1400),BMW(1500),Porsche(1200),Tesla(1900),Peugeot(1300);

    private double weight;
    private BrandType(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

}
