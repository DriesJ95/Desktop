package be.intecbrussel.exceptions;

/**
 * NoMoreIceCreamException extends Exception to have the capability of throwing an IceCream-specified Exception
 */
public class NoMoreIceCreamException extends Exception {
    public NoMoreIceCreamException(String message) throws Exception{
        throw new Exception(message);
    }
}
