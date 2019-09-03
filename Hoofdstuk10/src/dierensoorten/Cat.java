package dierensoorten;

public class Cat extends Animal{
    public Cat(){
        super();
    }
    public Cat(String name){
        super(name);
    }
    @Override
    public void move(){
        System.out.println("The cat moves");
    }
    @Override
    public void makeNoise(){
        System.out.println("Meow");
    }
}
