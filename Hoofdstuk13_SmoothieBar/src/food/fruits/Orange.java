package food.fruits;

public class Orange extends Fruit {
    public double price = 0.50;

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void Mix(){
        System.out.println("The Orange is peeled and squeezed into the smoothie");
    }
}
