import entity.School;
import entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class SaveSchool {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        School school = new School();
        school.setName("Fjord");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student().setName("One").setSchool(school));
        studentList.add(new Student().setName("Two").setSchool(school));
        studentList.add(new Student().setName("Three").setSchool(school));
        studentList.add(new Student().setName("Four").setSchool(school));
        studentList.add(new Student().setName("Z").setSchool(school));
        school.setStudents(studentList);

        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(school);
        et.commit();
        emf.close();
    }
}
