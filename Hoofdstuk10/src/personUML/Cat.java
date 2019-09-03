package personUML;

public class Cat extends Pet{
    public Cat(){
        super("",0,0);
    }
    public Cat(String name){
        super(name,0,0);
    }
    public Cat(String name, int age, double weight){
        super(name,age,weight);
    }
    public int calculateRealAge(){
        return this.getAge()*9;
    }
    @Override
    public void beCute(){
        System.out.println("Climbs on your lap and starts purring");
    }
}
