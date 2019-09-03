package parkeerPlaats;

public class ParkeerPlaats {
    private Auto [] autos = {};
    private String name;

    public ParkeerPlaats(){
        setAutos(autos);
    }

    public ParkeerPlaats(String name){
        setAutos(autos);
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAutos(Auto[] autos){
        this.autos = autos;
    }

    public Auto [] getAutos(){
        return autos;
    }

    public void addAuto(Auto auto){
        Auto [] temp = new Auto [autos.length + 1];
        for (int i = 0; i < temp.length-1; i++){
            temp[i] = autos[i];
        }
        temp[temp.length-1] = auto;
        autos = temp;
    }

    public void printParkeerLayout(){
        System.out.println("De parking " + this.getName() + " bevat volgende auto's:");
        String output = "";
        for (int i = 1; i < autos.length + 1; i++){
            output = output.concat(autos[i-1].toString());
            if (i % 3 == 0){
                output = output.concat("\n");
            }
        }
        System.out.println(output);
    }
}
