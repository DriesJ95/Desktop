package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @ElementCollection
    @CollectionTable
    private Collection<Ingredient> ingredients = new ArrayList<>();

    public Menu(String title, Collection<Ingredient> ingredients) {
        this();
        this.title = title;
        this.ingredients = ingredients;
    }

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public Menu setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Menu setTitle(String title) {
        this.title = title;
        return this;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public Menu setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @Override
    public String toString() {
        return String.format("Menu{id=%d, title='%s', ingredients=%s}", id, title, ingredients);
    }
}
