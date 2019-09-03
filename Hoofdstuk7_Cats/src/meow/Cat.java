package meow;

public class Cat {
    private double weight;
    private int number;

    public Cat(double weight, int number){
        setWeight(weight);
        setNumber(number);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString(){
        return "Cat " + getNumber() + " weighs " + getWeight() + "\n";
    }
}
