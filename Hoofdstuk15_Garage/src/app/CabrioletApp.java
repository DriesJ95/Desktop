package app;


import garage.Cabriolet;
import garage.Car;
import enums.Color;

public class CabrioletApp {

    public static void main(String[] args) {

        System.out.println("Cabriolet.count = " + Cabriolet.getCount());
        System.out.println("Car.count = " + Car.getCount());

        System.out.println("--------------------------------");
        System.out.println("    Cabriolet setters");
        System.out.println("--------------------------------");
        Cabriolet cabrioletBlue = new Cabriolet();
        System.out.println("cabriolet.color = " + cabrioletBlue.getColor());
        System.out.println("cabriolet.speed = " + cabrioletBlue.getSpeed());
        System.out.println("cabriolet.openRoof = " + cabrioletBlue.isOpenRoof());
        cabrioletBlue.setColor(Color.BLUE);
        System.out.println("cabriolet.color = " + cabrioletBlue.getColor());
        cabrioletBlue.setOpenRoof(true);
        System.out.println("cabriolet.openRoof = " + cabrioletBlue.isOpenRoof());

        System.out.println("Cabriolet.count = " + Cabriolet.getCount());
        System.out.println("Car.count = " + Car.getCount());

        System.out.println("--------------------------------");
        System.out.println("    Cabriolet constructor");
        System.out.println("--------------------------------");
        Cabriolet cabrioletGreen = new Cabriolet(Color.GREEN,888, true);
        System.out.println("cabriolet.color = " + cabrioletBlue.getColor());
        System.out.println("cabriolet.openRoof = " + cabrioletBlue.isOpenRoof());


        Cabriolet cabrioletBlack = new Cabriolet(Color.PINK,888, true);
        Cabriolet cabrioletWhite = new Cabriolet(Color.GREEN,888, true);
        Cabriolet cabrioletYellow = new Cabriolet(Color.BLUE,888, true);
        Cabriolet cabrioletRed= new Cabriolet(Color.RED,888, true);

        System.out.println("Cabriolet hashCode");
        System.out.println("cabriolet.hashCode = " + cabrioletBlue.hashCode());

        System.out.println("--------------------------------");
        System.out.println("    Cabriolet toString");
        System.out.println("--------------------------------");
        System.out.println(cabrioletBlue.toString());


        System.out.println("--------------------------------");
        System.out.println("    Garbage Collector");
        System.out.println("--------------------------------");
        System.out.println("Befor garbage collector Cabriolet.count = " + Cabriolet.getCount());
        System.out.println("Car.count = " + Car.getCount());
        cabrioletBlue = null;
        cabrioletBlack = null;
        cabrioletRed = null;
        System.gc();


        //give it some time
        for(double i = 0; i <10000000; i++) {

        }
        System.out.println("After garbage collector Cabriolet.count = " + Cabriolet.getCount());
        System.out.println("Car.count = " + Car.getCount());


    }

}
