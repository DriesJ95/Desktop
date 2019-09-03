package app;

import garage.*;
import enums.Color;
import interfaces.Moveable;

import java.util.Random;

/**
 *This GarageApp will instantiate a new garage and fill it up with semi-randomised Moveable_objects.
   The output will be (possibly) Exception messages and a print-out of the Garage_object.
 *@author Dries Joncheere
 *@version 1.0.1
 */

public class GarageApp {
    public static void main(String[] args) {
        Garage carhole = new Garage(80);
        Random rand = new Random();

        for (int i = 0; i < 80; i++) {
            int carChoice = rand.nextInt(3);
            try {
                switch (carChoice) {
                    case 0:
                        carhole.addVehicle(new SportCar(Color.getRandom(),rand.nextInt(500)+1000));
                        break;
                    case 1:
                        carhole.addVehicle(new FamilyCar(Color.getRandom(),rand.nextInt(500)+1000));
                        break;
                    case 2:
                        carhole.addVehicle(new Cabriolet(Color.getRandom(),rand.nextInt(500)+1000, true));
                        break;
                }
                ((Car) carhole.getVehicles()[i]).setSpeed(rand.nextInt(300));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        carhole.printGarage();

        Moveable[] temp;
        temp = carhole.getVehicles();

        System.out.println(((Car)temp[0]).getChassisID());
        if ( temp[0].hashCode() == temp[0].hashCode()){
            if (temp[0].equals(temp[0])){
                System.out.println("They're equal");
            }else{
                System.out.println("They aren't equal");
            }
        }else{
            System.out.println("They aren't equal");
        }
    }
}

