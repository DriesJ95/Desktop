package exceptions;

public class BoatFullException extends Exception{

    private static long serialVersionUID;

    public BoatFullException() throws Exception{
        throw new Exception("Boat is already full");
    }
}
