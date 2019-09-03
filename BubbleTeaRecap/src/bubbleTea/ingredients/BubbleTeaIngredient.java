package bubbleTea.ingredients;

public abstract class BubbleTeaIngredient {
    private double price;

    public BubbleTeaIngredient(){
        this(0);
    }

    public BubbleTeaIngredient(double price){
        this.price = price;
    }

    public abstract double getPrice();

    public abstract void setPrice(double price);
}
