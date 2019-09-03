package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

/**
 * Class PriceList stores the prices of all types of Eatables.
 * Has setters and getters for each Eatable type's price.
 */
public class PriceList {
    private double ballPrice = 1.20;
    private double rocketPrice = 1.50;
    private double magnumStandardPrice = 1.80;

    public PriceList(){
        this(0,0,0);
    }

    /**
     * Constructor for PriceList with all the needed parameters
     * @param ballPrice double
     * @param rocketPrice double
     * @param magnumStandardPrice double
     */
    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice){
        setBallPrice(ballPrice);
        setMagnumStandardPrice(magnumStandardPrice);
        setRocketPrice(rocketPrice);
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setBallPrice(double ballPrice) {
        try {
            this.ballPrice = ballPrice;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void setRocketPrice(double rocketPrice) {
        try {
            this.rocketPrice = rocketPrice;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        try {
            this.magnumStandardPrice = magnumStandardPrice;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public double getMagnumStandardPrice(MagnumType type) {
        if (type.equals(MagnumType.ALPINENUTS)){
            return magnumStandardPrice*1.5;
        }else {
            return magnumStandardPrice;
        }
    }


}
