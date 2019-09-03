package bubbleTea.ingredients;

public class Cream extends BubbleTeaIngredient  {
    public Cream(double price){
        super(price);
    }

    private double price = 1.0;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cream";
    }
}
