package food.vegetables;
import interfaces.Mixable;

public abstract class Vegetable implements Mixable {
    @Override
    public abstract void Mix();

    @Override
    public abstract double getPrice();
}
