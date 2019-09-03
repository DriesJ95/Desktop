package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavour;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.*;

import java.text.DecimalFormat;
import java.util.Random;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList prijskaart = new PriceList(1.00,1.50,1.80);
        Stock stock = new Stock(1,100,300,100);
        IceCreamSeller ijsCar = new IceCreamCar(prijskaart,stock);
        Eatable[] ijsjes = new Eatable[15];
        Random rand = new Random();
        try {
            for (int i = 0; i < 15; i++) {
                switch (rand.nextInt(3)) {
                    case 0:
                        ijsjes[i] = ijsCar.orderCone(new Flavour[]{Flavour.getRandomFlavour(), Flavour.getRandomFlavour(), Flavour.getRandomFlavour()});
                        break;
                    case 1:
                        ijsjes[i] = ijsCar.orderIceRocket();
                        break;
                    case 2:
                        ijsjes[i] = ijsCar.orderMagnum(MagnumType.getRandomType());
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        for (Eatable e : ijsjes){
            if (e != null) {
                e.eat();
            }
        }
        System.out.println("The total price for this array of icecreams is " + new DecimalFormat("#.00").format(ijsCar.getProfit()) + " euros");
    }
}
