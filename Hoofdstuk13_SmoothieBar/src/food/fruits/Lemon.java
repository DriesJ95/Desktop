package food.fruits;

public class Lemon extends Fruit {
    private double price = 1.25;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void Mix() {
        System.out.println("The Lemon squirts into your eye as you press out the juices. GG WP");
    }
}
