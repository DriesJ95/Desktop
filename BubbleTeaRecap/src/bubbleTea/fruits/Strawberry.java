package bubbleTea.fruits;

import bubbleTea.ingredients.Fruit;

public class Strawberry extends Fruit {
    public static double price = 0.50;
    public Strawberry() {
        super(Strawberry.price);
    }
    public Strawberry(double price){
        super(price);
        Strawberry.price = price;
    }
    public void Boil(){
        System.out.println("Adding Strawberry to boiling water");
    }

    @Override
    public String toString() {
        return "Strawberry";
    }
}
