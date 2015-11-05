package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.entidade.Turma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author fernando
 */
public class TurmaDAO extends GenericDAO<Turma> {

    public TurmaDAO() {
        super(Turma.class);
    }

    @Override
    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

}
