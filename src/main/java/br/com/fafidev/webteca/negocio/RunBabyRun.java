package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.conexao.Conexao;
import javax.persistence.EntityManager;

/**
 *
 * @author fernando
 */
public class RunBabyRun {

    public static void main(String[] args) {
        EntityManager em = Conexao.getEntityManager();
        em.close();
    }
}
