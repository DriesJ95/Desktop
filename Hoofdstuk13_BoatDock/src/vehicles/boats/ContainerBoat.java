package vehicles.boats;

public class ContainerBoat extends Boat {
    public int horsePower;

    public ContainerBoat(String name, double weight, double topSpeed, int horsePower){
        super(name,weight,topSpeed);
        setHorsePower(horsePower);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void accelerate(){
        System.out.println("The " + getName() + " rumbles loudly as the enormous propellers start turning quicker");
    }
}
