package superHeroes;

public class Healer extends Hero {
    public final String DESCRIPTION = "Healer";
    private String superPower = "The healer casts a spell of protection.";
    public Healer(){
        super("",0);
    }
    public Healer(String name){
        super(name,0);
    }
    public Healer(String name, int age){
        super(name,age);
    }
    @Override
    public void useSuperPower() {
        System.out.println(superPower);
    }
    @Override
    public String toString(){
        return "'" +this.getAlias()+ "'" + " is a " + this.DESCRIPTION + " type Hero, aged " + this.getAge() + ". \nand has the following superpower: \n" + this.superPower;
    }
}
