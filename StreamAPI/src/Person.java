public class Person {
    private String firstname;
    private String lastname;
    private GeslachtClass geslacht;
    private int age;
    private float weight;
    private float lenght;

    //constructor
    public Person() {
    }

    public Person(String firstname, String lastname, String geslacht, int age, float weight, float lenght) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.geslacht = new GeslachtClass(geslacht);
        this.age = age;
        this.weight = weight;
        this.lenght = lenght;
    }

    public Person(String firstname, String lastname, GeslachtClass.Geslacht geslacht, int age, float weight, float lenght) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.geslacht = new GeslachtClass(geslacht);
        this.age = age;
        this.weight = weight;
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", geslacht=" + geslacht.name().toLowerCase() +
                ", age=" + age +
                ", weight=" + weight +
                ", lenght=" + lenght +
                '}';
    }
}

