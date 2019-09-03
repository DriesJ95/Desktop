package bubbleTea.ingredients;

public class Bubble extends BubbleTeaIngredient {

    private Taste type;

    public Bubble(double price, Taste type){
        super(price);
        this.type = type;
    }

    public static double price = 0.50;
    public Bubble(Taste type) {
        super(Bubble.price);
        this.type = type;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public enum Taste {
        SOURAPPLE,SWEETAPPLE,LIME,STRAWBERRY,BLUEBERRY;
    }

    @Override
    public String toString() {
        return  type.name().toLowerCase() + " Bubbles";
    }
}
