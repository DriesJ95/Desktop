package boat;

import garage.Car;

public class CarZone {
    private int maxVehicle;
    private String zoneID;
    private Car[] cars;

    public CarZone(String zoneID, int maxVehicle){
        this.zoneID = zoneID;
        setMaxVehicle(maxVehicle);
    }

    public int getMaxVehicle(){
        return maxVehicle;
    }

    public void setMaxVehicle(int maxVehicle){
        this.maxVehicle = maxVehicle;
    }

    public int getZoneID(){
        return Integer.parseInt(zoneID);
    }
}
