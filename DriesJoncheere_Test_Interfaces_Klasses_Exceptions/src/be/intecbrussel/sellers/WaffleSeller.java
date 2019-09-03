package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Eatable;

public class WaffleSeller implements Profitable {

    private double profit;

    public Waffle orderWaffle(){
        Waffle gauffre = new Waffle();
        profit += gauffre.getPrice();
        return gauffre;
    }

    public double getProfit(){
        return profit;
    }

    public class Waffle implements Eatable{

        private final double price = 2.00;

        public Waffle(){}

        public double getPrice() {
            return price;
        }

        public void eat() {
            System.out.println("Nom nom nom, waffles");
        }

    }
}
