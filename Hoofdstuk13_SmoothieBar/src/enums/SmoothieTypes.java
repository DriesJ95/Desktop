package enums;
import food.fruits.*;
import food.vegetables.*;
import interfaces.Mixable;

public enum SmoothieTypes {
    BanaSlide(new Mixable[]{new Banana(), new Banana(), new Orange()}),
    StrawberryDream(new Mixable[]{new Strawberry(),new Orange(),new Orange(),new Banana()}),
    Citrus(new Mixable[]{new Orange(),new Orange(),new Lemon()}),
    VegieSlurry(new Mixable[]{new Banana(),new Cellery(),new Spinache(),new Apple()});

    private Mixable[] mix;

    SmoothieTypes(Mixable[] mix){
        this.mix = mix;
    }

    public Mixable[] getIngredients(){
        return mix;
    }
}
