package dierensoorten;

public class Fish extends Animal {
    public Fish(){
        super();
    }
    public Fish(String name){
        super(name);
    }
    @Override
    public void move(){
        System.out.println("The fish swims on");
    }
    @Override
    public void makeNoise(){
        System.out.println("Blub blub");
    }
}
