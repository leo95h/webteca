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

    public static EntityManager getEntityManager() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory("webtecaPU");
        }
        if (em == null) {
            em = factory.createEntityManager();
        }
        return em;
    }
}
