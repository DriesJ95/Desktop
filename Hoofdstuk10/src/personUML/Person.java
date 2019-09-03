package personUML;
import java.util.Arrays;

public class Person {
    private double weight;
    private int age;
    private String name;
    private static int count;
    private Pet[] pets;
    private Hobby[] hobbies;
    private House house;

    public void showMyHobbies(){
        System.out.println("My hobbies are: " + Arrays.toString(hobbies));
    }

    public Person(){
        this("",0,0);
    }

    public Person(String name, int age, double weight){
        setWeight(weight);
        setAge(age);
        setName(name);
    }

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

    public static int getCount() {
        return count;
    }

    static{
        count++;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    /*public void addPet(Pet pet){
        Pet[] temp = new Pet [pets.length+1];
        ...
    }*/

    public Hobby[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(Hobby[] hobbies) {
        this.hobbies = hobbies;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
