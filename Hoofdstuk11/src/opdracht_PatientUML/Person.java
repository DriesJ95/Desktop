package opdracht_PatientUML;

public class Person {
    private String name;
    private int age;
    private double weight;
    private Gender gender;

    public Person(String name, int age, double weight,Gender gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public Person(){
        this("",0,0,null);
    }

    public Person(Person person){
        this(person.getName(),person.getAge(), person.getWeight(), person.getGender());

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString(){
        return "This person is a " + this.getGender() + ", is called " + this.getName() + ", is " +this.getAge() + " years old and weighs " + this.getWeight() + "kg. ";
    }
}
