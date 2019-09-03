package personUML;

public abstract class Pet {
    private double weight;
    private int age;
    private String name;
    protected int realAge;

    public Pet(String name, int age, double weight){
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public abstract void beCute();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

