package harbor;

public class Harbor {
    private String name;
    private String country;
    private static Dock[] docks;

    public Harbor(){
        this("");
    }

    public Harbor(String name){
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }
}
