package opdracht_PatientUML;

public class PersonApp {
    public static void main(String[] args) {
        Person persoon = new Person("Pipo", 32, 79,Gender.VROUW);
        Person patient = new Patient(BloodType.A);
        patient.setAge(12);
        patient.setGender(Gender.MAN);
        patient.setName("Floppy");
        patient.setWeight(55);

        Person patient1 = new Patient(persoon,BloodType.B);

        System.out.println(patient.toString());
        System.out.println(patient1.toString());
    }
}
