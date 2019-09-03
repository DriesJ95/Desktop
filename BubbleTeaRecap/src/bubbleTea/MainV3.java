package bubbleTea;

import bubbleTea.fruits.Apple;
import bubbleTea.fruits.Orange;
import bubbleTea.fruits.Strawberry;
import bubbleTea.ingredients.Bubble;
import bubbleTea.ingredients.BubbleTeaIngredient;

public class MainV3 {
    public static void main(String[] args) {
        BubbleTeaIngredient ingredient1 = new Apple();
        BubbleTeaIngredient ingredient2 = new Bubble(Bubble.Taste.SOURAPPLE);
        BubbleTeaIngredient ingredient3 = new Strawberry(1);
        BubbleTeaIngredient ingredient4 = new Orange();


        System.out.println(ingredient1.getClass() + " prijs " + ingredient1.getPrice());
        System.out.println(ingredient2.getClass() + " prijs " + ingredient2.getPrice());
        System.out.println(ingredient3.getClass() + " prijs " + ingredient3.getPrice());
        System.out.println(ingredient4.getClass() + " prijs " + ingredient4.getPrice());

        ((Orange)ingredient4).setPrice(0.75);

        System.out.println(ingredient4.getClass() + " prijs " + ingredient4.getPrice());

    }
}
