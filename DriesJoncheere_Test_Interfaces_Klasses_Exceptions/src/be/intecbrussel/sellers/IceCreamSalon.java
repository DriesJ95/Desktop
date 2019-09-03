package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

/**
 * Class IceCreamSalon, Implements IceCreamSeller
 * Venue for ordering Eatable objects
 * @see IceCreamSeller
 * @see Eatable
 * @see Profitable
 * @see PriceList
 */
public class IceCreamSalon implements IceCreamSeller {
    private PriceList pricelist;
    private double totalProfit;

    public IceCreamSalon(){
        this(null);
    }

    public IceCreamSalon(PriceList pricelist){
        this.pricelist = pricelist;
    }

    public double getProfit(){
        return totalProfit;
    }

    @Override
    public Cone orderCone(Flavour[] balls) {
        for (Flavour f : balls){
            totalProfit += pricelist.getBallPrice();
        }
        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += pricelist.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        totalProfit += pricelist.getMagnumStandardPrice(type);
        return new Magnum(type);
    }

    public String toString(){
        return "The ice cream salon has a total profit of " + getProfit() + " euros";
    }
}
