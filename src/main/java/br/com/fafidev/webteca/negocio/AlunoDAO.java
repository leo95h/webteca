package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.entidade.Aluno;

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
    public void save(Aluno entity) {
        entity.setPessoaFisica(this.pessoaFisicaDAO.merge(entity.getPessoaFisica()));
        super.save(entity);
    }

}
