package br.com.fafidev.webteca.negocio;

import javax.persistence.EntityManager;

/**
 *
 * @author fernando
 */
public class GenericDAO<T> {

    private T classe;

    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void salvarNovo(T entity) {
        entityManager.persist(entity);
    }
    
    public T salvar(T entity) {
        return entityManager.merge(entity);
    }
}
