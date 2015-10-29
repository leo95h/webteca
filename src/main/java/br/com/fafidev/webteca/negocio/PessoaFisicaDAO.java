package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.entidade.PessoaFisica;

/**
 *
 * @author fernando
 */
public class PessoaFisicaDAO extends GenericDAO<PessoaFisica> {

    public PessoaFisicaDAO() {
        super(PessoaFisica.class);
    }

    @Override
    public PessoaFisica merge(PessoaFisica entity) {
        System.out.println("PESSOA FÍSICA!");
        return super.merge(entity);
    }

}
