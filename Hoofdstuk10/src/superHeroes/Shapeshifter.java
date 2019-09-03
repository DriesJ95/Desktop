package superHeroes;

public class Shapeshifter extends Hero {
    public final String DESCRIPTION = "Shapeshifter";
    private String superPower = "The shapeshifter shifts into a suitable combatform.";
    public Shapeshifter(){
        super("",0);
    }
    public Shapeshifter(String name){
        super(name,0);
    }
    public Shapeshifter(String name, int age){
        super(name,age);
    }
    @Override
    public void useSuperPower() {
        System.out.println(superPower);
    }
    @Override
    public String toString(){
        return "'" + this.getAlias()+ "'" + " is a " + this.DESCRIPTION + " type Hero, aged " + this.getAge() + ".\nand has the following superpower: \n" + this.superPower;
    }
}
