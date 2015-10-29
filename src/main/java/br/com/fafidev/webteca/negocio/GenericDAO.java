package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.negocio.util.Conexao;
import br.com.fafidev.webteca.negocio.util.ExcecaoNegocio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author fernando
 */
public class GenericDAO<T> implements Serializable {

    private Class classe;
    private EntityManager entityManager;

    public GenericDAO(Class classe) {
        this.classe = classe;
        this.entityManager = Conexao.createInstance().getEntityManager();
    }

    public void save(T entity) {
        try {
            begin();
            getEntityManager().persist(entity);
            commit();
        } catch (Exception ex) {
            throw new ExcecaoNegocio("Erro ao salvar: " + ex.getMessage(), ex);
        }
    }

    public void update(T entity) {
        begin();
        getEntityManager().merge(entity);
        commit();
    }

    public T merge(T entity) {
        begin();
        entity = getEntityManager().merge(entity);
        commit();
        return entity;
    }

    public void delete(Object id) {
        Object obj = findById(id);
        begin();
        getEntityManager().remove(obj);
        commit();
    }

    public T findById(Object id) {
        return (T) getEntityManager().find(classe, id);
    }

    public List<T> findAll() {
        String hql = " from " + classe.getSimpleName() + " obj order by obj.id ";
        Query q = getEntityManager().createQuery(hql);
        return q.getResultList();
    }

    protected void begin() {
        getEntityManager().getTransaction().begin();
    }

    protected void commit() {
        getEntityManager().getTransaction().commit();
        getEntityManager().close();
    }

    public Class getClasse() {
        return classe;
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }
}
