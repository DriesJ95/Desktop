package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

/**
 * Interface IceCreamSeller, Extends Profitable
 * @see Profitable
 */
public interface IceCreamSeller extends Profitable {
    Cone orderCone(Flavour[] balls) throws Exception;
    IceRocket orderIceRocket() throws Exception;
    Magnum orderMagnum(MagnumType type) throws Exception;

}
