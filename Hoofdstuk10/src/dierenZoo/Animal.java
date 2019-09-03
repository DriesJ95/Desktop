package dierenZoo;

public abstract class Animal {
    private String name;
    private double weight;
    private String gender;
    private int age;
    private boolean happy;
    private String motto;

    public Animal(String name, double weight, String gender, int age, boolean happy, String motto) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.happy = happy;
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    @Override
    public String toString(){
            return "{" +
                    "name: '" + name + '\'' +
                    ", weight: " + weight +
                    ", gender: '" + gender + '\'' +
                    ", age: " + age +
                    ", happy: " + happy +
                    ", motto: " + motto +
                    '}';
    }
}
