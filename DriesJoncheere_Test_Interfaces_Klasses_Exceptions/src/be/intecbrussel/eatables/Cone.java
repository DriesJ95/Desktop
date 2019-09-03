package be.intecbrussel.eatables;

/**
 * Class Cone, Implements Eatable
 * Cone is used to store een array of Flavour, the flavours of icecream
 * @see Flavour
 */
public class Cone implements Eatable {
    private Flavour[] balls;

    /**
     * Constructor without parameters
     */
    public Cone(){
        this(null);
    }

    /**
     * Constructor for Cone
     * @param balls Flavour[]
     */
    public Cone(Flavour[] balls){
        this.balls = balls;
    }

    /**
     * Prints out the eat method for a Cone object
     * @see Eatable
     */
    public void eat(){
        String output = "You eat the cone with following flavours: ";
        for (int i = 0; i < balls.length; i++){
            output = output.concat(balls[i].name().toLowerCase() + " ");
        }
        System.out.println(output);
    }
}
