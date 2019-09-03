package bubbleTea.ingredients;

import bubbleTea.interfaces.Boilable;

public abstract class Fruit extends BubbleTeaIngredient implements Boilable {


    public Fruit(double price){
        super(price);
        this.price = price;
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
}
