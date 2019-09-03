package food.fruits;

public class Banana extends Fruit {
    public double price = 1.10;

    @Override
    public void Mix(){
        System.out.println("The Banana is cut and dropped into the smoothie");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
