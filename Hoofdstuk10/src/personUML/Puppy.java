package personUML;

public class Puppy extends Dog{
    public Puppy(){
        super("",0,0);
    }
    public Puppy(String name){
        super(name,0,0);
    }
    public Puppy(String name, int age, double weight){
        super(name,age,weight);
    }
}
