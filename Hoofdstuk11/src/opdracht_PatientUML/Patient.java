package opdracht_PatientUML;

public class Patient extends Person {
    private BloodType bloodtype;

    public Patient (){
        this(null);

    }

    public Patient(BloodType bloodtype){
        super("",0,0,null);
        this.bloodtype = bloodtype;
    }
    public Patient (Person person, BloodType bloodtype){
        super(person);
        this.bloodtype = bloodtype;

    }

    public BloodType getBloodType(){
        return bloodtype;
    }

    @Override
    public String toString(){
        return super.toString() + "Bloodtype: " + getBloodType();
    }
}
