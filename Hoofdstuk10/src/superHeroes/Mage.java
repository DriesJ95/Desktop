package superHeroes;

public class Mage extends Hero {
    public final String DESCRIPTION = "Mage";
    private String superPower = "The mage turns one of the enemies into a sheep!";
    public Mage(){
        super("",0);
    }
    public Mage(String name){
        super(name,0);
    }
    public Mage(String name, int age){
        super(name,age);
    }
    @Override
    public void useSuperPower() {
        System.out.println(superPower);
    }
    @Override
    public String toString(){
        return "'" +this.getAlias()+ "'" + " is a " + this.DESCRIPTION + " type Hero, aged " + this.getAge() + ".\nand has the following superpower: \n" + this.superPower;
    }
}
