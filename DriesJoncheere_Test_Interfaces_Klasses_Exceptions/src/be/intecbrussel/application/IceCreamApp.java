package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavour;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

import java.text.DecimalFormat;
import java.util.Random;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList prijskaart = new PriceList(1.00,1.50,1.80);
        IceCreamSeller ijsSalon = new IceCreamSalon(prijskaart);
        Eatable[] ijsjes = new Eatable[8];
        Random rand = new Random();
        try {
            for (int i = 0; i < 8; i++) {
                switch (rand.nextInt(3)) {
                    case 0:
                        ijsjes[i] = ijsSalon.orderCone(new Flavour[]{Flavour.getRandomFlavour(), Flavour.getRandomFlavour(), Flavour.getRandomFlavour()});
                        break;
                    case 1:
                        ijsjes[i] = ijsSalon.orderIceRocket();
                        break;
                    case 2:
                        ijsjes[i] = ijsSalon.orderMagnum(MagnumType.getRandomType());
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        for (Eatable e : ijsjes){
            e.eat();
        }
        System.out.println("The total price for this array of icecreams is " + new DecimalFormat("#.00").format(ijsSalon.getProfit()) + " euros");
    }
}
