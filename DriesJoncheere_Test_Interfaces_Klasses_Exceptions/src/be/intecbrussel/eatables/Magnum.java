package be.intecbrussel.eatables;

/**
 * Class Magnum, Implements Eatable
 * Creates Magnum object using either no parameter or a MagnumType parameter
 * @see MagnumType
 */
public class Magnum implements Eatable {
    private MagnumType type;

    /**
     * Constructor without parameters, standard object, initialised MagnumType = null
     */
    public Magnum(){
        this(null);
    }

    /**
     * Constructor with parameter
     * @param type MagnumType
     */
    public Magnum(MagnumType type){
        this.type = type;
    }
    /**
     * Prints out the eat method for a Magnum object
     * @see Eatable
     */
    public void eat(){
        System.out.println("You eat the " + getType().name().toLowerCase() + " flavoured Magnum, yum");
    }

    /**
     * Used to return the MagnumType of this
     * @return type MagnumType
     */
    public MagnumType getType() {
        return type;
    }
}
