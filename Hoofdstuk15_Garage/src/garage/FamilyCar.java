package garage;
import enums.Color;

/**
 * Subclass of Car
 */
public class FamilyCar extends Car {

    private static int NUMBER_OF_SEATS = 5;
    private static int count;

    public FamilyCar(){
        this(null,0);
    }

    public FamilyCar(Color color){
        this(color,0);
    }

    public FamilyCar(Color color, double weight){
        super(color,weight);
        count++;
    }


    public static int getCount(){
        return count;
    }

    public String toString(){
        return "|FamilyCar: color: " + getColor().name().toLowerCase() + ", speed: " + getSpeed() + "km/h|";
    }

    public void finalize(){
        super.count--;
        this.count--;
    }
}
