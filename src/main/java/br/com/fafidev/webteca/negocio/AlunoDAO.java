package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.entidade.Aluno;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author fernando
 */
public class AlunoDAO extends GenericDAO<Aluno> {

    private PessoaFisicaDAO pessoaFisicaDAO;

    public AlunoDAO() {
        super(Aluno.class);
        this.pessoaFisicaDAO = new PessoaFisicaDAO();
    }

    @Override
    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

}
