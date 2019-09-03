package be.intecbrussel.eatables;

/**
 * Class IceRocket, Implements Eatable
 */
public class IceRocket implements Eatable {

    /**
     * Constructor without parameters, standard object
     */
    public IceRocket(){}

    /**
     * Prints out the eat method for an IceRocket object
     * @see Eatable
     */
    public void eat(){
        System.out.println("You eat the IceRocket");
    }
}
