package br.com.fafidev.webteca.controle;

import br.com.fafidev.webteca.controle.util.JsfUtil;
import br.com.fafidev.webteca.entidade.Estado;
import br.com.fafidev.webteca.negocio.EstadoDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author fernando
 */
@ManagedBean
@SessionScoped
public class EstadoControlador implements Serializable {

    private Estado estado;
    private EstadoDAO estadoDAO;
    private boolean edicao;

    public EstadoControlador() {
        newInstances();
    }

    private void newInstances() {
        this.estado = new Estado();
        this.estadoDAO = new EstadoDAO();
    }

    public String salvar() {
        try {
            if (edicao) {
                estadoDAO.update(estado);
            } else {
                estadoDAO.save(estado);
            }
            JsfUtil.addSuccessMessage("Estado salvo com sucesso!");
            return prepararLista();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Erro ao salvar estado");
            return null;
        }
    }

    public String excluir(Estado estado) {
        try {
            estadoDAO.delete(estado);
            JsfUtil.addSuccessMessage("Estado removido com sucesso!");
            return prepararLista();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Erro ao excluir estado");
            return null;
        }
    }

    public String prepararLista() {
        newInstances();
        return "lista";
    }

    public String prepararEdicao(Estado estado) {
        newInstances();
        this.estado = estado;
        edicao = true;
        return "edita";
    }

    public String prepararNovo() {
        newInstances();
        edicao = true;
        return "edita";
    }

    public String prepararVer(Estado estado) {
        newInstances();
        this.estado = estado;
        edicao = false;
        return "edita";
    }

    
    
    public List<Estado> getEstados() {
        return estadoDAO.listAll();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public EstadoDAO getEstadoDAO() {
        return estadoDAO;
    }

    public boolean isEdicao() {
        return edicao;
    }

    public void setEdicao(boolean edicao) {
        this.edicao = edicao;
    }

}
