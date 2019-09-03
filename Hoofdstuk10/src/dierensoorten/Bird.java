package dierensoorten;

public class Bird extends Animal{
    public Bird(){
        super();
    }
    public Bird(String name){
        super(name);
    }
    @Override
    public void move(){
        System.out.println("The bird flies away");
    }
    @Override
    public void makeNoise(){
        System.out.println("Makaaaaw");
    }
}
