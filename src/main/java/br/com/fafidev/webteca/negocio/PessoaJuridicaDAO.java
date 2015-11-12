package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.entidade.PessoaJuridica;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author fernando
 */
public class PessoaJuridicaDAO extends GenericDAO<PessoaJuridica> {

    public PessoaJuridicaDAO() {
        super(PessoaJuridica.class);
    }

    @Override
    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

}
