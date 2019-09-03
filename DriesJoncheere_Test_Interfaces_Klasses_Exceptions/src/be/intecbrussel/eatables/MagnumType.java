package be.intecbrussel.eatables;

import java.util.Random;

/**
 * Enum MagnumType is used to store all types of Magni and has a method to get a random MagnumType
 */
public enum MagnumType {
    MILKCHOCOLATE,WHITECHOCOLATE,BLACKCHOCOLATE,ALPINENUTS,ROMANTICSTRAWBERRIES;

    private static Random rand = new Random();
    //See Flavour for reasoning behind this
    private static MagnumType[] types = MagnumType.values();

    /**
     * Random magnumType
     * @return MagnumType (randomised)
     */

    public static MagnumType getRandomType(){
        return types[rand.nextInt(5)];
    }
}
