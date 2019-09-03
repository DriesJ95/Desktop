import entities.Ingredient;
import entities.Menu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class SaveMenu {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        em.persist(new Menu().setTitle("Piet's Cakes").setIngredients(new ArrayList<>() {
            {
                add(new Ingredient(50, "Butter"));
                add(new Ingredient(35, "Sugar"));
            }
        }));
        tx.commit();
        em.close();
    }
}

