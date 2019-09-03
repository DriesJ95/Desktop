package be.intecbrussel.sellers;

/**
 * Class Stock, used to store integer values to represent current stock.
 * Has setters and getters for each of its variables
 */
public class Stock {
    private int iceRockets;
    private int cones;
    private int balls;
    private int magni;

    /**
     * Constructor for Stock with all the needed parameters
     * @param iceRockets int
     * @param cones int
     * @param balls int
     * @param magni int
     */
    public Stock(int iceRockets,int cones,int balls, int magni){
        setIceRockets(iceRockets);
        setCones(cones);
        setBalls(balls);
        setMagni(magni);
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }
}
