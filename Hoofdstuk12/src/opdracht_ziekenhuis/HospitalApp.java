package opdracht_ziekenhuis;

public class HospitalApp {
    public static void main(String[] args) {

        //Aanmaak van personen
        PregnantPatient one = new PregnantPatient();
        one.setGivenName("Fien");
        one.setDeliveryDate("01/06/2019");
        one.setDepartement(Departement.Gynocology);
        one.setGender(Gender.WOMAN);
        Gynocologist two = new Gynocologist();
        two.setGivenName("Julien");
        two.setJoined("09/08/1993");
        two.setGender(Gender.MAN);
        StomachSurgeon three = new StomachSurgeon();
        three.setGivenName("Alexis");
        three.setJoined("13/02/2019");
        three.setGender(Gender.WOMAN);
        Receptionist four = new Receptionist();
        four.setGivenName("Margaritte");
        four.setJoined("09/03/1977");
        four.setGender(Gender.WOMAN);
        four.setDepartement(Departement.Radiology);

        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());






    }
}
