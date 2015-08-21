package br.com.fafidev.webteca;

import br.com.fafidev.webteca.conexao.Conexao;
import br.com.fafidev.webteca.entidade.Usuario;
import javax.persistence.EntityManager;

/**
 *
 * @author fernando
 */
public class App {

    public static void main(String[] args) {
        EntityManager em = Conexao.getEntityManager();

        Usuario us = new Usuario("fernando", "senha10");
        em.getTransaction().begin();
        em.persist(us);
        em.getTransaction().commit();

        Conexao.close();
    }
}
