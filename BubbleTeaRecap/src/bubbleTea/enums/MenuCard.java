package bubbleTea.enums;

import bubbleTea.fruits.Apple;
import bubbleTea.fruits.Strawberry;
import bubbleTea.ingredients.Bubble;
import bubbleTea.ingredients.BubbleTeaIngredient;
import bubbleTea.ingredients.Cream;
import bubbleTea.spices.Ginger;

import java.util.ArrayList;


public enum MenuCard {
    GREENDELIGHT(new ArrayList<BubbleTeaIngredient>() {
        {
            add(new Apple());
            add(new Bubble(Bubble.Taste.SOURAPPLE));
            add(new Cream(0.5));
        }
    }),REDDREAM(new ArrayList<BubbleTeaIngredient>() {
        {
            add(new Strawberry());
            add(new Bubble(Bubble.Taste.STRAWBERRY));
        }
    }),GINGERSPICE(new ArrayList<BubbleTeaIngredient>() {
        {
            add(new Ginger());
            add(new Bubble(Bubble.Taste.LIME));
        }
    });

    private ArrayList<BubbleTeaIngredient> ingredients;

    MenuCard(ArrayList<BubbleTeaIngredient> ingredients){
        this.ingredients = ingredients;
    }

    public ArrayList<BubbleTeaIngredient> getIngredients(){
        return ingredients;
    }
}
