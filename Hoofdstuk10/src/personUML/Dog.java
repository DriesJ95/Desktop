package personUML;

public class Dog extends Pet{

    public Dog(){
        super("",0,0);
    }
    public Dog(String name){
        super(name,0,0);
    }
    public Dog(String name, int age, double weight){
        super(name,age,weight);
    }
    public int calculateRealAge(){
        return this.getAge()*7;
    }
    @Override
    public void beCute(){
        System.out.println("Starts circling it's own tail in an attempt to catch it");
    }

}
