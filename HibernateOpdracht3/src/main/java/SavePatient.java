import entity.MedicalFile;
import entity.Patient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePatient {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        Patient patient = new Patient();
        MedicalFile mf = new MedicalFile();
        mf.setHeight(160);
        patient.setName("Idefix");
        patient.addMedicalFile(mf);
        EntityTransaction et = em.getTransaction();
        mf.setHeight(120);
        mf.setWeight(140);

        et.begin();
        em.persist(patient);
        et.commit();
        Patient patient1 = em.find(Patient.class,7L);
        MedicalFile mf2 = patient1.getMedicalFile();
        System.out.println(mf2.getHeight());
        em.close();
        emf.close();




    }
}
