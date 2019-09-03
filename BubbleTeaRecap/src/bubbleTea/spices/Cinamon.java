package bubbleTea.spices;

import bubbleTea.ingredients.Spice;

public class Cinamon extends Spice {
    public static double price = 0.50;
    public Cinamon() {
        super(Cinamon.price);
    }

    public Cinamon(double price){
        super(price);
        Cinamon.price = price;
    }

    public void Boil(){
        System.out.println("Adding Cinamon to boiling water");
    }

    @Override
    public String toString() {
        return "Cinamon";
    }
}
