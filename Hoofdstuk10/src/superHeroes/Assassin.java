package superHeroes;

public class Assassin extends Hero {
    public final String DESCRIPTION = "Assassin";
    private String superPower = "The assassin quickly eviscerates one of the enemies.";
    public Assassin(){
        super("",0);
    }
    public Assassin(String name){
        super(name,0);
    }
    public Assassin(String name, int age){
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
