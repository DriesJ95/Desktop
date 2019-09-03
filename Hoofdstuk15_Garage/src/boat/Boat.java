package boat;

import enums.Color;

public class Boat {
    private static int count;
    private String city;
    private int number;
    private String callSign;
    private double speed;

    public Boat(){
        this("",0);
    }

    public Boat(String city, int number){
        this.city = city;
        this.number = number;
        count++;
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public static int getCount(){
        return count;
    }
}
