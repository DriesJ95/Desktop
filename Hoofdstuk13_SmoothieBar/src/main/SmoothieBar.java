package main;
import enums.SmoothieTypes;
import food.Smoothie;
import food.fruits.Apple;
import food.fruits.Banana;
import food.fruits.Orange;
import food.vegetables.Cellery;
import food.vegetables.Spinache;
import interfaces.Mixable;

public class SmoothieBar {
    public static void main(String[] args) {
        Smoothie smo1 = new Smoothie(SmoothieTypes.BanaSlide);
        smo1.printSmoothie();
        Mixable appel = new Apple();
        Mixable banaan = new Banana();
        Mixable sinaasappel = new Orange();
        Mixable selder = new Cellery();
        Mixable spinozze = new Spinache();

        Mixable[] mixke = {appel,banaan,sinaasappel,selder,spinozze};
        Smoothie smo2 = new Smoothie(mixke);
        smo2.printSmoothie();
    }
}
