package dierensoorten;

public class AnimalApp {
    public static void main(String[] args) {
        Animal sissel = new Snake("Sissel");
        Animal crolly = new Cat("Crolly");
        Animal floppy = new Fish("Floppy");
        Animal blue = new Bird("Blue");

        sissel.move();
        sissel.makeNoise();

        crolly.move();
        crolly.makeNoise();

        floppy.move();
        floppy.makeNoise();

        blue.move();
        blue.makeNoise();
    }
}
