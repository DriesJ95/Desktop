package opdracht1_planets;

public enum Planet {
    MERCURIUS(530.00,22),
    VENUS(430.00,24),
    AARDE(330.00,26),
    MARS(630.00,28),
    JUPITER(730.00,35),
    SATURNUS(830.00,42),
    URANUS(930.00,56),
    NEPTUNUS(230.00,64);

    private double weight;
    private double distanceToSun;

    Planet (double weight, double distanceToSun){
        this.weight = weight;
        this.distanceToSun = distanceToSun;
    }
}
