package food.fruits;

public class Strawberry extends Fruit {
    public double price = 0.75;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void Mix(){
        System.out.println("The Strawberry is cut and dropped into the smoothie");
    }
}
