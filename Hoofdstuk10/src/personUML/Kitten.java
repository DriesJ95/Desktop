package personUML;

public class Kitten extends Cat{
    public Kitten(){
        super("",0,0);
    }
    public Kitten(String name){
        super(name,0,0);
    }
    public Kitten(String name, int age, double weight){
        super(name,age,weight);
    }
}
