package entities;

import javax.persistence.Embeddable;

@Embeddable
public class Ingredient {
    private int quantity;
    private String name;

    public Ingredient() {
    }

    public Ingredient(int quantity, String name) {
        this();
        this.quantity = quantity;
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Ingredient setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ingredient setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Ingredient{quantity=%d, name='%s'}", quantity, name);
    }
}
