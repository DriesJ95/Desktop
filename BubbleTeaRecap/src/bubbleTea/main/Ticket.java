package bubbleTea.main;


import java.time.LocalDateTime;

public class Ticket {
    private static int counter;
    private String id;
    private double price;
    private Order order;
    private LocalDateTime ticketTime;

    public Ticket(Order order){
        this.order = order;
        this.price = order.getOrderPrice();
        ticketTime = LocalDateTime.now();
        this.id = String.valueOf(ticketTime.getDayOfYear() + ticketTime.getNano() + counter++);

    }

    public Order getOrder(){
        return order;
    }

    public String getID(){
        return id;
    }

    public Ticket(){
        this(null);
    }

    public double calcPrice() {
        return price;
    }

    public int getCount(){
        return counter;
    }
}
