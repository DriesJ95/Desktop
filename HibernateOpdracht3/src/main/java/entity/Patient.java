package entity;

import javax.persistence.*;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    private String name;
    @OneToOne(orphanRemoval = true,fetch = FetchType.LAZY)
    private MedicalFile medicalFile;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    public void addMedicalFile(MedicalFile mf){
        medicalFile = mf;
        mf.setPatient(this);
    }

    public void removeMedicalFile(){
        if(medicalFile!=null){
            medicalFile.setPatient(null);
            medicalFile = null;
        }
    }

    public long getId() {
        return id;
    }

    public Patient setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public Patient setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
        return this;
    }
}
