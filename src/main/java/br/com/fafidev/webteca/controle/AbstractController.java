package br.com.fafidev.webteca.controle;

import br.com.fafidev.webteca.negocio.GenericDAO;
import br.com.fafidev.webteca.util.WebtecaException;
import java.io.Serializable;

/**
 *
 * @author fernando
 */
public class AbstractController implements Serializable {

    private Object selecionado;
    private GenericDAO dao;

    public AbstractController(Object selecionado, GenericDAO dao) {
        this.selecionado = selecionado;
        this.dao = dao;
        newInstances();
    }

    public String novo() {
        newInstances();
        return "edita.xhtml";
    }

    public String salvar() {
        dao.save(selecionado);
        newInstances();
        return "lista.xhtml";
    }

    protected void newInstances() {
        try {
            selecionado = selecionado.getClass().newInstance();
            dao = dao.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException ex) {
            throw new WebtecaException("Erro ao gerar instâncias: " + ex.getMessage(), ex);
        }
    }

    public Object getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(Object selecionado) {
        this.selecionado = selecionado;
    }

    public GenericDAO getDao() {
        return dao;
    }

}
