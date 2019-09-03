package bubbleTea.fruits;

import bubbleTea.ingredients.Fruit;

public class Orange extends Fruit {
    public static double price = 0.50;
    public Orange() {
        super(Orange.price);
    }

    public Orange(double price){
        super(price);
        Orange.price = price;
    }

    @Override
    public void Boil() {
            System.out.println("Adding Orange to boiling water");
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
