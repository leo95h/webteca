package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.entidade.Pais;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author fernando
 */
public class PaisDAO extends GenericDAO<Pais> {

    public PaisDAO() {
        super(Pais.class);
    }

    @Override
    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

}
