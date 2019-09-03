package bubbleTea;

import bubbleTea.fruits.Apple;
import bubbleTea.fruits.Orange;
import bubbleTea.ingredients.BubbleTeaIngredient;
import bubbleTea.main.BubbleTea;
import bubbleTea.main.BubbleTeaBar;

import java.util.ArrayList;

public class MainV8 {
    public static void main(String[] args) {
        BubbleTeaBar pindaBar = new BubbleTeaBar();
        ArrayList<BubbleTeaIngredient> ingredients = new ArrayList<>();
        ingredients.add(new Apple());

        pindaBar.bubbleTeaMethod(ingredients);


        BubbleTea tea1 = new BubbleTea(ingredients);
        tea1.drink();

        BubbleTea tea2 = new BubbleTea();
        tea2.addIngredient(new Orange());
        tea2.drink();

        BubbleTea tea3 = new BubbleTea();
        tea3.setIngredients(ingredients);
        tea3.drink();


    }
}
