package superHeroes;

public class Cupido extends Hero {
    public final String DESCRIPTION = "Cupido";
    private String superPower = "Shoots arrows, so the target falls in love!";
    public Cupido(){
        super("",0);
    }
    public Cupido(String name){
        super(name,0);
    }
    public Cupido(String name, int age){
        super(name,age);
    }
    public void useSuperPower(){
        System.out.println(superPower);
    }
    @Override
    public String toString(){
        return "'" +this.getAlias()+ "'" + " is a " + this.DESCRIPTION + " type Hero, aged " + this.getAge() + ". \nand has the following superpower: \n" + this.superPower;
    }
}
