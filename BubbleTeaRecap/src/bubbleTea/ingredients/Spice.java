package bubbleTea.ingredients;

import bubbleTea.interfaces.Boilable;

public abstract class Spice extends BubbleTeaIngredient implements Boilable {
    public Spice(double price){
        super(price);
    }

    private double price;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void Boil();

    @Override
    public String toString() {
        return "Spice";
    }
}
