package persoonOef;

public class PersonApp {
    public static void main(String[] args) {
        Person dries = new Person();

        dries.setName("Dries");
        dries.setLastName("Joncheere");
        dries.setAddress("Vogelzanglaan", 13, 1910);
        dries.setAge(23);
        dries.setHeight(1.72);
        dries.setHobbys(new String [] {});

        dries.printInfo();
    }
}
