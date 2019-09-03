package bubbleTea.fruits;

import bubbleTea.ingredients.Fruit;

public class Apple extends Fruit {
    public static double price = 0.75;
    public Apple() {
        super(Apple.price);
    }

    public Apple(double price){
        super(price);
        Apple.price = price;
    }

    public void Boil(){
        System.out.println("Adding Apple to boiling water");
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
