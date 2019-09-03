package enums;
import java.util.Random;

/**
 *This enum is used to colour the Moveable_objects.
 */

public enum Color {
    RED(255,000,000),BLUE(000,000,255),GREEN(000,255,000),YELLOW(000,123,122),PINK(200,000,80),WHITE(0,0,0);

    private int r;
    private int g;
    private int b;
    private static Random rand = new Random();

    Color(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    /**
     * Generate a random Color from this enums values
     * @return Color
     */
    public static Color getRandom(){
        int i = (rand.nextInt(6));
            return Color.values()[i];

    }

    public int getR(){
        return r;
    }

    public int getG(){ return g;}

    public int getB(){ return b;}
}
