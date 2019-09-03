package food;
import enums.SmoothieTypes;
import interfaces.Mixable;
import java.text.DecimalFormat;

public class Smoothie {
    public Mixable[] ingredients;
    public SmoothieTypes type;

    public Smoothie(SmoothieTypes type){
        this.type = type;
        this.ingredients = type.getIngredients();
    }

    public Smoothie(Mixable[] mix){
        this.ingredients = mix;
    }

    public double getPrice(){
        double price = 0;
        for(Mixable i : ingredients){
            price += i.getPrice();
        }
        return price;
    }

    public void mixSmoothie(){
        for (Mixable m : ingredients){
            m.Mix();
        }
    }

    public void printSmoothie(){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Your Smoothie is being made: ");
        System.out.println("------------------------------------------------------------------");
        mixSmoothie();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Cost: " + (new DecimalFormat("#.00")).format(getPrice()) + "€\n");
    }
}
