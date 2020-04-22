package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;

import javax.persistence.Persistence;

public class PersistenceUtil {

    private static EntityManagerFactory emFactory;

    public static EntityManagerFactory getEmFactory() {
        if (emFactory == null) {
            emFactory = Persistence.createEntityManagerFactory("MusicAlbumsPU");
        }
        return emFactory;
    }

    public void closeEmFactory() {
        if (emFactory != null) {
            emFactory.close();
        }
    }
}
