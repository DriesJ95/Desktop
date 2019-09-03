package bubbleTea;

import bubbleTea.fruits.Strawberry;
import bubbleTea.ingredients.Bubble;
import bubbleTea.ingredients.BubbleTeaIngredient;
import bubbleTea.spices.Cinamon;

public class MainV2 {
    public static void main(String[] args) {
        BubbleTeaIngredient ingredient1 = new Strawberry(0.50);
        BubbleTeaIngredient ingredient2 = new Cinamon(0.75);
        BubbleTeaIngredient ingredient3 = new Bubble(0.50, Bubble.Taste.LIME);

        System.out.println(ingredient1.getClass() + " prijs " + ingredient1.getPrice());
        System.out.println(ingredient2.getClass() + " prijs " + ingredient2.getPrice());
        System.out.println(ingredient3.getClass() + " prijs " + ingredient3.getPrice());
    }
}
