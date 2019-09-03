package app;
import garage.ProtoGarage;
import interfaces.Moveable;

public class AnonCarsApp {
    public static void main(String[] args) {
        ProtoGarage carhole2 = new ProtoGarage(10);
        Moveable[] cars = carhole2.protoCars(10);
        carhole2.setVehicles(cars);
        carhole2.printGarage();
    }
}
