package garage;
import enums.Color;

public class Cabriolet extends SportCar {
    private static int count;
    private boolean isRoofOpen;

    public Cabriolet(){
        this(null,0,false);
    }

    public Cabriolet(Color color){
        this(color,0,false);
    }

    public Cabriolet(Color color, double weight, boolean isRoofOpen){
        super(color,weight);
        setOpenRoof(isRoofOpen);
        count++;
    }

    public boolean isOpenRoof(){
        return isRoofOpen;
    }

    public void setOpenRoof(boolean roofStatus){
        this.isRoofOpen = roofStatus;
    }

    public static int getCount(){
        return count;
    }

    public String toString(){
        return "|Cabriolet: color: " + getColor().name().toLowerCase() + ", speed: " + getSpeed() + "km/h|";
    }

    public void finalize(){
        super.count--;
        Car.count--;
        this.count--;
    }
}
