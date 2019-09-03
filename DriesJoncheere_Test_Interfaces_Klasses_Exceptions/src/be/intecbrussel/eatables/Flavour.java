package be.intecbrussel.eatables;

import java.util.Random;

/**
 * Enum Flavour is used to store all possible flavours of balls and can return a randomFlavour
 */
public enum Flavour {
    STRAWBERRY,BANANA,CHOCOLATE,VANILLA,LEMON,STRACIATELLA,MOKKA,PISTACHE;

    private static Random rand = new Random();
    //smaken variabele aangemaakt om de getRandomFlavour memory usage te onderdrukken (Flavour.values() telkens opnieuw
    //aanroepen zou waste of resources zijn.
    private static Flavour [] smaken = Flavour.values();

    /**
     * Random flavour
     * @return Flavour (randomised)
     */
    public static Flavour getRandomFlavour(){
        return smaken[rand.nextInt(8)];
    }
}
