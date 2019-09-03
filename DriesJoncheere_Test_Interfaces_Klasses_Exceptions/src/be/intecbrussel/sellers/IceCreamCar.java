package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;
import be.intecbrussel.exceptions.NoMoreIceCreamException;

/**
 * Class IceCreamCar, Implements IceCreamSeller
 * Stores a pricelist, a stock and a profit
 * Venue for ordering Eatable objects
 * @see IceCreamSeller
 * @see Eatable
 * @see Profitable
 * @see PriceList
 * @see Stock
 */
public class IceCreamCar implements IceCreamSeller {
    private PriceList pricelist;
    private Stock stock;
    private double profit;

    /**
     * Constructor for IceCreamCar with no parameters
     * Initialised PriceList and Stock as null
     */
    public IceCreamCar(){
        this(null,null);
    }

    /**
     * Constructor for IceCreamCar with 2 parameters
     * @param pricelist PriceList
     * @param stock Stock
     */
    public IceCreamCar(PriceList pricelist, Stock stock){
        this.pricelist = pricelist;
        this.stock = stock;
    }

    /**
     * Orders a Cone with specified Flavour[] balls
     * @param balls desired array of flavours
     * @return cone Cone
     * @throws Exception if there are insufficient Cones or Balls in the Stock object
     */
    @Override
    public Cone orderCone(Flavour[] balls) throws Exception {
        if (stock.getBalls() < balls.length){
            new NoMoreIceCreamException("There are no more balls".toUpperCase());
        }
        if (stock.getCones() < 1){
            new NoMoreIceCreamException("There are no more cones".toUpperCase());
        }
        for (Flavour f : balls) {
            profit += pricelist.getBallPrice();
        }
        return prepareCone(balls);
    }

    /**
     * Used in orderCone to alter stock and create the new Cone object
     * @param balls desired array of flavours
     * @return cone Cone
     */
    private Cone prepareCone(Flavour[] balls){
        stock.setCones(stock.getCones()-1);
        stock.setBalls(stock.getBalls()-balls.length);
        return new Cone(balls);
    }

    /**
     * Orders an IceRocket
     * @return iceRocket IceRocket
     * @throws Exception if there are insufficient IceRockets in the Stock object
     */
    @Override
    public IceRocket orderIceRocket() throws Exception {
        if (stock.getIceRockets() < 1){
            new NoMoreIceCreamException("There are no more icerockets".toUpperCase());
        }
        profit += pricelist.getRocketPrice();
        return prepareIceRocket();
    }

    /**Used in orderIceRocket to alter stock and create the new Cone object
     * @return iceRocket IceRocket
     */
    private IceRocket prepareIceRocket(){
        stock.setIceRockets(stock.getIceRockets()-1);
        return new IceRocket();
    }

    /**
     * Orders a Magnum of the specified type
     * @param type desired MagnumType
     * @return magnum Magnum
     * @throws Exception if there are insufficient Magni in the Stock object
     */
    @Override
    public Magnum orderMagnum(MagnumType type) throws Exception {
        if (stock.getMagni() < 1){
            new NoMoreIceCreamException("There are no more magni".toUpperCase());
        }
        profit += pricelist.getMagnumStandardPrice(type);
        return prepareMagnum(type);
    }


    /**
     * Used in orderMagnum to alter stock and create the new Magnum object
     * @param type desired MagnumType
     * @return magnum Magnum
     */
    private Magnum prepareMagnum(MagnumType type){
        stock.setMagni(stock.getMagni()-1);
        return new Magnum(type);
    }

    /**
     * @see Profitable
     * @return profit double
     */
    @Override
    public double getProfit() {
        return profit;
    }

    /**
     * Used to return the total profit of the IceCreamCar in a String format
     * @return profit String
     */
    public String toString(){
        return "The ice cream car has a total profit of " + getProfit() + " euros";
    }
}
