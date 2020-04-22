package repo;
import entity.*;
import util.*;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


public class AlbumRepository {

    public void create(Albums album) {
        EntityManagerFactory emf = PersistenceUtil.getEmFactory();
        EntityManager em = emf.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        em.persist(album);
        entityTransaction.commit();
        em.close();
    }

    public Albums findById(int id) {
        EntityManagerFactory emf = PersistenceUtil.getEmFactory();
        EntityManager em = emf.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        Albums album = em.find(Albums.class, id);
        em.persist(album);
        entityTransaction.commit();
        em.close();
        return album;
    }

    public List<Albums> findByName(String name) {
        EntityManagerFactory emf = PersistenceUtil.getEmFactory();
        EntityManager em = emf.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        List<Albums> albums = em.createNamedQuery("Albums.findByName").setParameter("name", name).getResultList();
        em.close();
        return albums;
    }

    public List<Albums> findByArtist(int artistId) {
        EntityManagerFactory emf = PersistenceUtil.getEmFactory();
        EntityManager em = emf.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        List<Albums> albums = em.createNamedQuery("Albums.findByArtistId").setParameter("name", artistId).getResultList();
        em.close();
        return albums;
    }
}
