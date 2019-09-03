package garage;

import enums.Color;

import java.text.DecimalFormat;

public class SportCar extends Car {

    private static int NUMBER_OF_SEATS = 2;
    protected static int count;
    private DecimalFormat dc = new DecimalFormat("#.0");

    public SportCar(){
        this(null,0);
    }
    public SportCar(Color color, double weight){
        super(color,weight);
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String toString(){
        return "SportCar: " + getColor().name().toLowerCase() + " | " +   dc.format(getWeight()) + "kg | " + getSpeed() + "km/h";
    }

    public void finalize(){
        super.count--;
        this.count--;
    }

}
