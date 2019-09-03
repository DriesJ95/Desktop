package autoOef;

public class Passenger {
    private String name;
    public static int nrPassengers = 0;

    public Passenger(){
        this("");
    }
    public Passenger(String name){
        this.name = name;
        nrPassengers++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
