package autoOef;

public class autoApp {
    public static void main(String[] args) {
        Car auto = new Car();
        auto.addPassenger("Figaro");
        auto.addPassenger("Picasso");

        System.out.println(auto.autoToString());
    }
}
