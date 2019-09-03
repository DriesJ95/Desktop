package opdracht5;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueuApp {
    public static void main(String[] args) {
        Queue<BurgerOrder> orders = new PriorityQueue<>();

        orders.offer(new BurgerOrder("f", 6));
        orders.offer(new BurgerOrder("d", 4));
        orders.offer(new BurgerOrder("e", 5));
        orders.offer(new BurgerOrder("b", 2));
        orders.offer(new BurgerOrder("a", 1));
        orders.offer(new BurgerOrder("c", 3));
        
        System.out.println("Orders added: ");

        orders.forEach(System.out::println);
        BurgerOrder s = orders.poll();

        while (s != null) {
            System.out.println("polled " + s.getName());
            s = orders.poll();
        }

        orders.forEach(System.out::println);
    }
}
