package parkeerPlaats;
import java.util.Random;

public class parkeerPlaatsTester {
    public static void main(String[] args) {
        Random rand = new Random();
        ParkeerPlaats parking = new ParkeerPlaats("INTECparking");
        /* De 2 lijnen hieronder testen de getFuelType methode
        Auto auto1 = new Peugeot(1200);
        auto1.getFUELTYPE();
        */
        //Onderstaand programma maakt 10 semi-random auto's aan en steekt ze in de gewenste parkeerplaats(gewicht is niet variabel hier)
        for (int i = 0; i < 10; i++) {
            int choice = rand.nextInt(5);
            switch (choice) {
                case 0:
                    Auto auto = new BMW(1400);
                    parking.addAuto(auto);
                    break;
                case 1:
                    auto = new Peugeot(1100);
                    parking.addAuto(auto);
                    break;
                case 2:
                    auto = new Tesla(1800);
                    parking.addAuto(auto);
                    break;
                case 3:
                    auto = new Porsche(1200);
                    parking.addAuto(auto);
                    break;
                case 4:
                    auto = new Audi(1400);
                    parking.addAuto(auto);
                    break;
            }
        }
        parking.printParkeerLayout();

    }
}
