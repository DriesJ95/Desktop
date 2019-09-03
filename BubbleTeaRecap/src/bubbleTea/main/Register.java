package bubbleTea.main;

import java.util.ArrayList;

public class Register {
    private ArrayList<Ticket> tickets;
    private double profit;

    public Register(){
        this.tickets = new ArrayList<>();
        this.profit = 0;
    }

    public void addTicket(Ticket ticketln){
        tickets.add(ticketln);
        profit += ticketln.calcPrice();
    }

    public double getProfit(){
        return profit;
    }

}
