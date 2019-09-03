import entity.Office;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarsApp {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();
        Office testOffice = em.find(Office.class, "1");
        System.out.println(testOffice);
        et.commit();
        emf.close();
    }
}
