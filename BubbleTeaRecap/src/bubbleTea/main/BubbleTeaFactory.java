package bubbleTea.main;

import bubbleTea.enums.MenuCard;
import bubbleTea.ingredients.BubbleTeaIngredient;

import java.util.ArrayList;

public class BubbleTeaFactory {

    public Stock stock;
    private Register kassa;

    public BubbleTeaFactory(){
        this.kassa = kassa;
        this.stock = new Stock(100,100,100,100,100,500,500);
    }


    public BubbleTea bubbleTeaFactoryMethod(ArrayList<BubbleTeaIngredient> ingredients){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Your bubbly tea is being prepared, ingredients being added:");
        ingredients.forEach(System.out::println);
        try {
            stock.getIngredients(ingredients);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Failed to make the tea");
        }
        System.out.println("--------------------------------------------------------------");
        return new BubbleTea(ingredients);

    }

    public BubbleTea bubbleTeaFactoryMethod(MenuCard choice){
        return bubbleTeaFactoryMethod(choice.getIngredients());
    }

}
