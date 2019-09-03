package bubbleTea.main;

import bubbleTea.ingredients.BubbleTeaIngredient;

import java.util.ArrayList;

public class BubbleTeaBar {
    private Register kassa;
    public Stock stock;
    private BubbleTeaFactory teaMaker;

    public BubbleTeaBar(){
        kassa = new Register();
        stock = new Stock(2,2,2,2,2,5,5);
        teaMaker = new BubbleTeaFactory();
    }

    public void acceptTicket(Ticket ticketln){
        kassa.addTicket(ticketln);
    }

    public String getStock(){
        return stock.toString();
    }

    public double getOmzet(){
        return kassa.getProfit();
    }

    public BubbleTea makeBubbleTea(ArrayList<BubbleTeaIngredient> ingredients){
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

    public BubbleTea makeBubbleTea(Order order){
        return makeBubbleTea(order.getIngredients());
    }

    //public BubbleTea makeBubbleTea(MenuCard choice){}


}
