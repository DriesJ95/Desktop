package exceptions;

public class GarageFullException extends Exception {
    private static long serialVersionUID;

    public GarageFullException() throws Exception{
        throw new Exception("Garage is already full");
    }
}
