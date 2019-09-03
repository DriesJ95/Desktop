package exceptions;

public class VehicleAlreadyInGarageException extends Exception {
    private static long serialVersionUID;

    public VehicleAlreadyInGarageException() throws Exception {
        throw new Exception("Vehicle is already in garage");
    }
}
