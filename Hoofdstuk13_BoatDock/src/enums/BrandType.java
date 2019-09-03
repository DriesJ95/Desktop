package enums;

public enum BrandType {
    Audi(1800),Porsche(1200),Tesla(3000);

    private double weight;
    BrandType(double weight){
        this.weight = weight;
    }
}
