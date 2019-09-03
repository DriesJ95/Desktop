package bubbleTea.main;

import bubbleTea.ingredients.BubbleTeaIngredient;
import java.util.ArrayList;

public class Order {
    private ArrayList<BubbleTeaIngredient> ingredients;
    private int orderNo;
    private static int counter;
    private double orderPrice;


    public Order(ArrayList<BubbleTeaIngredient> ingredients){
        this.ingredients = ingredients;
        this.orderNo = counter++;
    }

    public ArrayList<BubbleTeaIngredient> getIngredients(){
        return ingredients;
    }

    public double getOrderPrice(){
        return ingredients.stream().mapToDouble(BubbleTeaIngredient::getPrice).sum();
    }

    public void addIngredient(BubbleTeaIngredient ingredient){
        ingredients.add(ingredient);
    }
}
