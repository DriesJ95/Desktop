package app;

import boat.CarBoat;
import enums.Color;
import garage.*;

import java.util.Arrays;
import java.util.Random;

public class CarBoatApp {
    public static void main(String[] args){

        CarBoat highway_of_the_sea = new CarBoat("Knokke",5,1000, 950000);

        // Vul de garage totdat die vol is en vang de exception op.
        // Zorg voor een gebruiksvriendelijke boodschap
        int randomAmount = (int) (900 + (Math.random() * 200));

        System.out.println(randomAmount + " cars are being made");

        for (int i = 0; i < randomAmount; i++) {
            try {
                highway_of_the_sea.addCarToBoat(new SportCar(Color.getRandom(),createRandomWeight()));
                highway_of_the_sea.getBoatContent()[i].setSpeed(createRandomSpeed());
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        highway_of_the_sea.printBoat();

    }

    private static double createRandomWeight() {
        return 900 + (Math.random() * 100);
    }
    public static Random rand = new Random();

    private static double createRandomSpeed() {
        return rand.nextInt(300) + 120;
    }

}
