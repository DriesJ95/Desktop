package bubbleTea;

import bubbleTea.fruits.Apple;
import bubbleTea.ingredients.Bubble;
import bubbleTea.ingredients.BubbleTeaIngredient;
import bubbleTea.ingredients.Cream;
import bubbleTea.main.BubbleTeaBar;
import bubbleTea.main.Order;
import bubbleTea.main.Ticket;
import bubbleTea.spices.Cinamon;

import java.util.ArrayList;

public class MainV6 {
    public static void main(String[] args) {
        BubbleTeaBar bar = new BubbleTeaBar();

        ArrayList<BubbleTeaIngredient> ingredients1 = new ArrayList<>();
        ingredients1.add(new Apple());
        ingredients1.add(new Bubble(Bubble.Taste.STRAWBERRY));
        Order order1 = new Order(ingredients1);
        bar.acceptTicket(new Ticket(order1));
        System.out.println("This order costs " + order1.getOrderPrice());

        ArrayList<BubbleTeaIngredient> ingredients2 = new ArrayList<>();
        ingredients2.add(new Cinamon());
        ingredients2.add(new Bubble(Bubble.Taste.SWEETAPPLE));
        Order order2 = new Order(ingredients2);
        bar.acceptTicket(new Ticket(order2));
        System.out.println("This order costs " + order2.getOrderPrice());

        ArrayList<BubbleTeaIngredient> ingredients3 = new ArrayList<>();
        ingredients3.add(new Apple());
        ingredients3.add(new Bubble(Bubble.Taste.STRAWBERRY));
        ingredients3.add(new Cream(0.50));
        Order order3 = new Order(ingredients3);
        bar.acceptTicket(new Ticket(order3));
        System.out.println("This order costs " + order3.getOrderPrice());

        System.out.println("De totale omzet is " + bar.getOmzet() + " euro");
    }
}
