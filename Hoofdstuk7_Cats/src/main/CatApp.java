package main;
import meow.Cat;
import meow.Pound;

import java.util.Arrays;
import java.util.Random;

public class CatApp {
    public static void main(String[] args) {
        Random rand = new Random();
        Pound mewmew = new Pound("MewMew");
        for (int i = 0; i < 10; i++){
            mewmew.addCat(new Cat(rand.nextDouble(),i));
        }
        System.out.println(Arrays.toString(mewmew.getCats()));

        mewmew.sortPound();

        System.out.println(Arrays.toString(mewmew.getCats()));
    }
}
