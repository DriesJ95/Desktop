package bubbleTea;

import bubbleTea.fruits.Apple;
import bubbleTea.ingredients.BubbleTeaIngredient;
import bubbleTea.main.Order;
import bubbleTea.main.Ticket;

import java.util.ArrayList;

public class MainV7 {
    public static void main(String[] args) {
        ArrayList<BubbleTeaIngredient> ingredients = new ArrayList<>();
        ingredients.add(new Apple());
        Ticket ticket1 = new Ticket(new Order(ingredients));

        System.out.println(ticket1.getID());

        Ticket ticket2 = new Ticket(new Order(ingredients));

        System.out.println(ticket2.getID());

        Ticket ticket3 = new Ticket(new Order(ingredients));

        System.out.println(ticket3.getID());

    }
}
