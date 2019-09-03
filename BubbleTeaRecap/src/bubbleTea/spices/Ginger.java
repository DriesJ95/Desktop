package bubbleTea.spices;

import bubbleTea.ingredients.Spice;

public class Ginger extends Spice {
    public static double price = 1.0;
    public Ginger() {
        super(Ginger.price);
    }

    public Ginger(double price){
        super(price);
        Ginger.price = price;
    }

    public void Boil(){
        System.out.println("Adding Ginger to boiling water, don't worry, they don't have a soul");
    }

    @Override
    public String toString() {
        return "Ginger";
    }
}
