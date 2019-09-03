package bubbleTea.main;

import bubbleTea.ingredients.BubbleTeaIngredient;

import java.util.ArrayList;

public class BubbleTea {
    private ArrayList<BubbleTeaIngredient> ingredients;

    public BubbleTea(){
        this(new ArrayList<>());
    }

    public BubbleTea(ArrayList<BubbleTeaIngredient> ingredients){
        this.ingredients = ingredients;
    }

    public void addIngredient (BubbleTeaIngredient ingredient){
        ingredients.add(ingredient);
    }

    public void setIngredients(ArrayList<BubbleTeaIngredient> ingredients){
        this.ingredients = ingredients;
    }

    public void drink(){
        System.out.println(toString());
    }

    public String toString(){
        return "I drink the yum yum tea";
    }
}
