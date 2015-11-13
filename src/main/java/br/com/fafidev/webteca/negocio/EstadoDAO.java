package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.entidade.Estado;
import br.com.fafidev.webteca.entidade.Pais;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author fernando
 */
public class EstadoDAO extends GenericDAO<Estado> {

    private final PaisDAO paisDAO;

    public EstadoDAO() {
        super(Estado.class);
        this.paisDAO = new PaisDAO();
    }

    public List<Pais> getPaises() {
        return paisDAO.listAll();
    }

    @Override
    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

}
