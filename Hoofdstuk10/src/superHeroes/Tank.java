package superHeroes;

public class Tank extends Hero {
    public final String DESCRIPTION = "Tank";
    private String superPower = "The tank assumes a defensive stance, charges the enemy and taunts him.";
    public Tank(){
        super("",0);
    }
    public Tank(String name){
        super(name,0);
    }
    public Tank(String name, int age){
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
