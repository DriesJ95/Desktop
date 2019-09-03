package personUML;

public class Hobby {
    private String name;
    private Address location;
    private static int count;
    private double timePerWeek;

    public Hobby(String name, Address location, double timePerWeek){
        setName(name);
        setLocation(location);
        setTimePerWeek(timePerWeek);
    }
    public Hobby(){
        this("",null,0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Address getLocation(){
        return location;
    }

    public void setTimePerWeek(double timePerWeek) {
        this.timePerWeek = timePerWeek;
    }

    public double getTimePerWeek(){
        return timePerWeek;
    }
}
