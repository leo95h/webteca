package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.negocio.util.Conexao;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.slf4j.Logger;

/**
 *
 * @author fernando
 */
public abstract class GenericDAO<T> implements Serializable {

    private final Class classe;
    private EntityManager entityManager;

    public GenericDAO(Class classe) {
        this.classe = classe;
    }

    public void save(T entity) {
        beginTransaction();
        getEntityManager().persist(entity);
        commitAndCloseTransaction();
    }

    public void update(T entity) {
        beginTransaction();
        getEntityManager().merge(entity);
        commitAndCloseTransaction();
    }

    public void delete(T entity) {
        beginTransaction();
        getEntityManager().remove(getEntityManager().merge(entity));
        commitAndCloseTransaction();
    }

    public T findById(Object id) {
        return (T) getEntityManager().find(classe, id);
    }

    public List<T> listAll() {
        String hql = "from " + classe.getSimpleName() + " obj order by obj.id";
        Query q = getEntityManager().createQuery(hql);
        return q.getResultList();
    }

    protected void beginTransaction() {
        getEntityManager().getTransaction().begin();
    }

    protected void commitAndCloseTransaction() {
        commit();
        closeTransaction();
    }

    private void commit() {
        getEntityManager().getTransaction().commit();
    }

    private void closeTransaction() {
        getEntityManager().close();
    }

    protected EntityManager getEntityManager() {
        if (!this.entityManager.isOpen() || this.entityManager == null) {
            getLogger().info("Closed or null EntityManager");
            this.entityManager = Conexao.createInstance().getEntityManager();
        }
        return this.entityManager;
    }

    public Class getClasse() {
        return classe;
    }

    protected abstract Logger getLogger();
}
