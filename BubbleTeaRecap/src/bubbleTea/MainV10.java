package bubbleTea;

import bubbleTea.fruits.Apple;
import bubbleTea.fruits.Orange;
import bubbleTea.fruits.Strawberry;
import bubbleTea.ingredients.Bubble;
import bubbleTea.ingredients.BubbleTeaIngredient;
import bubbleTea.ingredients.Cream;
import bubbleTea.main.BubbleTeaBar;
import bubbleTea.spices.Cinamon;
import bubbleTea.spices.Ginger;

import java.util.ArrayList;

public class MainV10 {
    public static void main(String[] args) {
        BubbleTeaBar zotteKoos = new BubbleTeaBar();


        zotteKoos.bubbleTeaMethod(new ArrayList<BubbleTeaIngredient>() {
            {
                add(new Orange());
                add(new Bubble(Bubble.Taste.LIME));
            }
        });

        zotteKoos.bubbleTeaMethod(new ArrayList<BubbleTeaIngredient>() {
            {
                add(new Ginger());
                add(new Bubble(Bubble.Taste.STRAWBERRY));
                add(new Cream(0.5));
            }
        });

        zotteKoos.bubbleTeaMethod(new ArrayList<BubbleTeaIngredient>() {
            {
                add(new Strawberry());
                add(new Bubble(Bubble.Taste.SWEETAPPLE));
            }
        });

        zotteKoos.bubbleTeaMethod(new ArrayList<BubbleTeaIngredient>() {
            {
                add(new Apple());
                add(new Bubble(Bubble.Taste.BLUEBERRY));
                add(new Cream(0.5));
            }
        });

        zotteKoos.bubbleTeaMethod(new ArrayList<BubbleTeaIngredient>() {
            {
                add(new Cinamon());
                add(new Bubble(Bubble.Taste.SOURAPPLE));
            }
        });

        zotteKoos.bubbleTeaMethod(new ArrayList<BubbleTeaIngredient>() {
            {
                add(new Orange());
                add(new Cream(0.5));
            }
        });

        zotteKoos.bubbleTeaMethod(new ArrayList<BubbleTeaIngredient>() {
            {
                add(new Orange());
                add(new Apple());
                add(new Cream(0.5));
            }
        });

        System.out.println(zotteKoos.getStock());
    }
}
