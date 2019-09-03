package superHeroes;

public class Berserker extends Hero {
    public final String DESCRIPTION = "Berserker";
    private String superPower = "The berserker goes into a frothing rage.";
    public Berserker(){
        super("",0);
    }
    public Berserker(String name){
        super(name,0);
    }
    public Berserker(String name, int age){
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
