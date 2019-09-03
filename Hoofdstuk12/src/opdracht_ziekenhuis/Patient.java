package opdracht_ziekenhuis;
import java.time.*;

public class Patient extends Person {
    public double id;
    public Departement departement;
    protected BloodType bloodType;
    protected LocalDate birthDate;
    private String prescriptions;
    public LocalDate DateOfAdmission;
    private int age;

    public Patient(String name, double id, Departement departement, BloodType bloodType, LocalDate birthDate, String prescriptions){
        super("",name,"","","",null);
        setId(id);
        setDepartement(departement);
        setBloodType(bloodType);
        setBirthDate(birthDate);
        setPrescriptions(prescriptions);
        setDateOfAdmission();
        if (getBirthDate() != null) {
            calcAge();
        }
    }

    public Patient(){
        this("",0,null,null,null,"");
    }

    public int getAge() {
        return age;
    }

    public void calcAge() {
        LocalDate geboorte = getBirthDate();
        LocalDate now = LocalDate.now();
        Period period = Period.between(geboorte, now);
        this.age = period.getYears();
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }



    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

    public LocalDate getDateOfAdmission() {
        return DateOfAdmission;
    }

    public void setDateOfAdmission() {
        DateOfAdmission = LocalDate.now();
    }

    public String toString(){
        return "";
    }
}
