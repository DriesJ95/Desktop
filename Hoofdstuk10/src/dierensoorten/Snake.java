package dierensoorten;

public class Snake extends Animal {
    public Snake(){
        super();
    }
    public Snake(String name){
        super(name);
    }
    @Override
    public void move(){
        System.out.println("The snake slithers through the grass");
    }
    @Override
    public void makeNoise(){
        System.out.println("Ssssss...");
    }
}
