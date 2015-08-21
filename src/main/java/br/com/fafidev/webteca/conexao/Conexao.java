package br.com.fafidev.webteca.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fernando
 */
public final class Conexao {

    private static EntityManagerFactory factory = null;
    private static EntityManager em = null;

    private static EntityManagerFactory getEntityManagerFactory() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory("webtecaPU");
        }
        return factory;
    }

    public static EntityManager getEntityManager() {
        if (em == null) {
            em = getEntityManagerFactory().createEntityManager();
        }
        return em;
    }

    public static void close() {
        em.close();
    }
}
