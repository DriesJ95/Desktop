package food.vegetables;

public class Cellery extends Vegetable {
    public double price = 0.85;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void Mix(){
        System.out.println("The Cellery is chopped up and dropped into the smoothie");
    }
}
