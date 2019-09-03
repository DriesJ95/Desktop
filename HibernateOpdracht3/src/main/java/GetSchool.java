import entity.School;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetSchool {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        School school = em.find(School.class, 1L);
        System.out.println(school.getStudents().toString());
        em.close();
        emf.close();

    }
}
