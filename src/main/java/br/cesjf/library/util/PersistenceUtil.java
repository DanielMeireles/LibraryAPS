package br.cesjf.library.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

public class PersistenceUtil {

    private static final String PERSISTENCE_UNIT_NAME = "Library";
    private static EntityManagerFactory FACTORY;
    private static ThreadLocal<EntityManager> MANAGER = new ThreadLocal<EntityManager>();
    private static Session SESSION;

    static {
        if (FACTORY == null) {
            try {
                FACTORY = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            } catch (Throwable e) {
                Logger.getLogger (PersistenceUtil.class.getName()).log(Level.WARNING, "Falha na criação do EntityManagerFactory!", e.getMessage());
                throw new ExceptionInInitializerError(e);
            }
        }
    }

    public static EntityManager getEntityManager() {
        EntityManager em = MANAGER.get();
        if (em == null) {
            em = FACTORY.createEntityManager();
            MANAGER.set(em);
        }
        return em;
    }

    public static void closeEntityManager() {
        EntityManager em = MANAGER.get();

        if (em != null) {
            em.close();
        }
        MANAGER.set(null);
    }

    public static Session getSession() {
        if (SESSION == null) {
            SESSION = (Session) getEntityManager().getDelegate();
        }
        return SESSION;
    }

}
