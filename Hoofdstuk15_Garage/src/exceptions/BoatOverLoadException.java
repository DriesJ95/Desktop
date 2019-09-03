package exceptions;

public class BoatOverLoadException extends Exception{
    private static long serialVersionUID;

    public BoatOverLoadException() throws Exception{
        throw new Exception("Boat is overloaded, yow mama too fat");
    }
}
