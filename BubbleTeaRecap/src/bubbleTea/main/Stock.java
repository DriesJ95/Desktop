package bubbleTea.main;

import bubbleTea.exceptions.BubbleIngredientShortage;
import bubbleTea.fruits.Apple;
import bubbleTea.fruits.Orange;
import bubbleTea.fruits.Strawberry;
import bubbleTea.ingredients.Bubble;
import bubbleTea.ingredients.BubbleTeaIngredient;
import bubbleTea.ingredients.Cream;
import bubbleTea.spices.Cinamon;
import bubbleTea.spices.Ginger;

import java.util.ArrayList;

public class Stock {
    private int apples;
    private int oranges;
    private int strawberries;
    private int cream;
    private int cinamon;
    private int ginger;
    private int bubbles;

    public Stock(int apples, int oranges, int strawberries, int cinamon, int ginger, int bubbles, int cream) {
        this.apples = apples;
        this.oranges = oranges;
        this.strawberries = strawberries;
        this.cream = cream;
        this.cinamon = cinamon;
        this.ginger = ginger;
        this.bubbles = bubbles;
    }

    public void getIngredients(ArrayList<BubbleTeaIngredient> ingredients) throws BubbleIngredientShortage {
        for (BubbleTeaIngredient i : ingredients) {
            if (i instanceof Apple) {
                if (getApples() == 0) {
                    throw new BubbleIngredientShortage("Not enough apples in stock");
                } else {
                    setApples(getApples() - 1);
                }
            }
            if (i instanceof Orange) {
                if (getOranges() == 0) {
                    throw new BubbleIngredientShortage("Not enough oranges in stock");
                } else {
                    setOranges(getOranges() - 1);
                }
            }
            if (i instanceof Strawberry) {
                if (getStrawberries() == 0) {
                    throw new BubbleIngredientShortage("Not enough strawberries in stock");
                } else {
                    setStrawberries(getStrawberries() - 1);
                }
            }
            if (i instanceof Cream) {
                if (getCream() == 0) {
                    throw new BubbleIngredientShortage("Not enough cream in stock");
                } else {
                    setCream(getCream() - 1);
                }
            }
            if (i instanceof Cinamon) {
                if (getCinamon() == 0) {
                    throw new BubbleIngredientShortage("Not enough cinamon in stock");
                } else {
                    setCinamon(getCinamon() - 1);
                }
            }
            if (i instanceof Ginger) {
                if (getGinger() == 0) {
                    throw new BubbleIngredientShortage("Not enough ginger in stock");
                } else {
                    setGinger(getGinger() - 1);
                }
            }
            if (i instanceof Bubble) {
                if (getBubbles() == 0) {
                    throw new BubbleIngredientShortage("Not enough bubbles in stock");
                } else {
                    setBubbles(getBubbles() - 1);
                }
            }

        }
    }

    public int getApples() {
        return apples;
    }

    public void setApples(int apples) {
        this.apples = apples;
    }

    public int getOranges() {
        return oranges;
    }

    public void setOranges(int oranges) {
        this.oranges = oranges;
    }

    public int getStrawberries() {
        return strawberries;
    }

    public void setStrawberries(int strawberries) {
        this.strawberries = strawberries;
    }

    public int getCream() {
        return cream;
    }

    public void setCream(int cream) {
        this.cream = cream;
    }

    public int getCinamon() {
        return cinamon;
    }

    public void setCinamon(int cinamon) {
        this.cinamon = cinamon;
    }

    public int getGinger() {
        return ginger;
    }

    public void setGinger(int ginger) {
        this.ginger = ginger;
    }

    public int getBubbles() {
        return bubbles;
    }

    public void setBubbles(int bubbles) {
        this.bubbles = bubbles;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "apples=" + apples +
                ", oranges=" + oranges +
                ", strawberries=" + strawberries +
                ", cream=" + cream +
                ", cinamon=" + cinamon +
                ", ginger=" + ginger +
                ", bubbles=" + bubbles +
                '}';
    }
}
