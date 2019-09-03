import entities.Album;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class SaveAlbum {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Album album = new Album("ZZ top","Grange");
        ArrayList<String> tracks = new ArrayList<>();
        tracks.add("Cheval");
        tracks.add("Duval");
        tracks.add("Sjeval");
        tracks.add("Zoral");
        album.setTracks(tracks);
        em.persist(album);
        tx.commit();
        em.close();
    }
}
