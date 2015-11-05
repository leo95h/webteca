package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.entidade.PessoaFisica;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author fernando
 */
public class PessoaFisicaDAO extends GenericDAO<PessoaFisica> {

    public PessoaFisicaDAO() {
        super(PessoaFisica.class);
    }

    @Override
    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

}
