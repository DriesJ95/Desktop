package mainApp;

import enums.BrandType;
import enums.FuelType;
import vehicles.boats.*;
import people.*;
import vehicles.cars.Car;

public class dockApp {
    public static void main(String[] args) {


        SailBoat boat1 = new SailBoat("King of Namur",550,12,14);
        boat1.setCaptain(new Captain("Maarten", 25));
        SpeedBoat boat2 = new SpeedBoat("FastBoy", 2000,122,255);
        boat2.setCaptain(new Captain("Justin", 24));
        FisherBoat boat3 = new FisherBoat("Z54",8000,40,60);
        boat3.setCaptain(new Captain("Cyriel", 70));
        boat3.setDeckHand(new DeckHand("Jhonny", "Duimpje",72));



        System.out.println(boat1.getName());
        System.out.println(boat2.getWeight());
        System.out.println(boat3.getNetSize());
        boat1.accelerate();
        boat2.accelerate();
        boat3.accelerate();

        ContainerBoat boat4 = new ContainerBoat("XXL500", 200_000, 25,10_000);
        CarBoat boat5 = new CarBoat("XL100", 50_000, 32, 3500);
        Car car1 = new Car(123, BrandType.Audi,240,new Person("Freddy",42), FuelType.Diesel,6.50,60.00);
        Car car2 = new Car(143, BrandType.Audi,240,new Person("Breddy",21), FuelType.Diesel,7.25,60.00);
        Car car3 = new Car(210, BrandType.Tesla,280,new Person("Creddy",25), FuelType.Electric,15,60.00);
        Car car4 = new Car(300, BrandType.Porsche,300,new Person("Dreddy",34), FuelType.Petrol,12.5,60.00);
        Car car5 = new Car(280, BrandType.Audi,320,new Person("Greddy",29), FuelType.Electric,17.5,60.00);
        Car car6 = new Car(300, BrandType.Porsche,300,new Person("Kreddy",45), FuelType.Petrol,12.5,60.00);

        boat5.addCar(car1);
        boat5.addCar(car2);
        boat5.addCar(car3);
        boat5.addCar(car4);
        boat5.addCar(car5);
        boat5.addCar(car6);

        System.out.println(boat5.toString());

    }
}
