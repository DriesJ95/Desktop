package bubbleTea;

import bubbleTea.main.Register;
import bubbleTea.main.Ticket;

public class MainV1 {
    public static void main(String[] args) {
        Register register = new Register();
        //register.addTicket(new Ticket(3));
        //register.addTicket(new Ticket(5));
        //register.addTicket(new Ticket(10));

        System.out.println("The current profit is " + register.getProfit() + " euros.");
    }
}
