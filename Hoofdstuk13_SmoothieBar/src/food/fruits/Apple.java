package food.fruits;

public class Apple extends Fruit {
    public double price = 0.55;

    @Override
    public void Mix(){
        System.out.println("The Apple is cut into pieces and dropped into the smoothie");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
