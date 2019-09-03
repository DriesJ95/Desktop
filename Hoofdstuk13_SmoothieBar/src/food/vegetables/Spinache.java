package food.vegetables;

public class Spinache extends Vegetable {
    public double price = 0.45;

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public void Mix(){
        System.out.println("The Spinache is ground up and dropped into the smoothie");
    }
}
