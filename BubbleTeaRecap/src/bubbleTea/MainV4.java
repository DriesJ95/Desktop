package bubbleTea;

import bubbleTea.fruits.*;
import bubbleTea.ingredients.*;
import bubbleTea.interfaces.Boilable;
import bubbleTea.spices.Cinamon;

import java.util.ArrayList;

public class MainV4 {
    public static void main(String[] args) {
        ArrayList<BubbleTeaIngredient> ingredients = new ArrayList<>();

        ingredients.add(new Apple());
        ingredients.add(new Bubble(Bubble.Taste.SOURAPPLE));
        ingredients.add(new Strawberry());
        ingredients.add(new Orange());
        ingredients.add(new Cinamon());

        double sum = ingredients.stream().mapToDouble(BubbleTeaIngredient::getPrice).sum();

        System.out.println("The total sum is " + sum + " euros");

        System.out.println("Boiling the boilables: ");
        System.out.println("-------------------------------------");
        for (BubbleTeaIngredient b : ingredients){
            if (b instanceof Boilable){
                ((Boilable) b).Boil();
            }
        }
        System.out.println("-------------------------------------");
    }
}
