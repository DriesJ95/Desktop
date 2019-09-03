package harbor;

import boat.CarBoat;
import boat.CarZone;
import garage.Garage;

public class CarDock extends Dock {
    private int MAX;
    private String country;
    private CarBoat boat;
    private Garage dockGarage;
    private CarZone[] dockParkeerPlaats;
    private final double MAX_SPEED = 25;

    public CarDock() {
    }

    public CarDock(String country, int max) {
        this.country = country;
        this.MAX = max;
        int numberOfZones;
        char[] Alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        if (MAX % 200 == 0) {
            numberOfZones = MAX / 200;
        } else {
            numberOfZones = Math.round(MAX / 200);
        }
        dockParkeerPlaats = new CarZone[numberOfZones];
        for (int i = 0; i < dockParkeerPlaats.length ; i++){
            dockParkeerPlaats[i] = new CarZone(Character.toString(Alfa[i]),200);
        }
    }

    public CarZone[] getZones(){
        return this.dockParkeerPlaats;
    }
}
