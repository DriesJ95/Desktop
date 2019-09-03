package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.sellers.WaffleSeller;

public class WaffleApp {
    public static void main(String[] args) {
        WaffleSeller wafelhuis = new WaffleSeller();
        WaffleSeller.Waffle gauffre = wafelhuis.orderWaffle();
        Eatable[] waffles = new Eatable[1];
        waffles[0] = gauffre;
        waffles[0].eat();
        System.out.println("The total profit is " + wafelhuis.getProfit() + " euros");
    }
}
