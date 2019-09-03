package opdracht_CarUML;

public class CarApp {
    public static void main(String[] args) {
        Person ego = new Person("Ego");
        Car tuut = new Car(900,BrandType.Porsche,340,ego,FuelType.Petrol,15,60);
        Car tuut1 = new Car(1200,BrandType.Tesla,300,ego,FuelType.Electric, 300,1000);
        Car tuut2 = new Car(80,BrandType.Peugeot,150,ego,FuelType.Diesel,18,50);
        System.out.println(tuut.toString());
        System.out.println(tuut1.toString());
        System.out.println(tuut2.toString());
    }
}
