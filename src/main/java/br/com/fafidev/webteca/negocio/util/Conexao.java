package br.com.fafidev.webteca.negocio.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fernando
 */
public final class Conexao {

    private static Conexao instance;
    private static EntityManagerFactory factory;

    private Conexao() {
        factory = Persistence.createEntityManagerFactory("webtecaPU");
    }

    public static Conexao createInstance() {
        if (instance == null) {
            instance = new Conexao();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
