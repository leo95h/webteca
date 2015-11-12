package br.com.fafidev.webteca.controle;

import br.com.fafidev.webteca.controle.util.JsfUtil;
import br.com.fafidev.webteca.entidade.Instituicao;
import br.com.fafidev.webteca.negocio.InstituicaoDAO;
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
public class InstituicaoControlador implements Serializable {

    private Instituicao instituicao;
    private InstituicaoDAO instituicaoDAO;
    private boolean edicao;

    public InstituicaoControlador() {
        newInstances();
    }

    public String salvarNovo() {
        try {
            instituicaoDAO.save(instituicao);
            JsfUtil.addSuccessMessage("Instituição salva com sucesso!");
            return prepararLista();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Erro ao salvar instituição");
            return null;
        }
    }

    public String salvar() {
        try {
            if (edicao) {
                instituicaoDAO.update(instituicao);
            } else {
                instituicaoDAO.save(instituicao);
            }
            JsfUtil.addSuccessMessage("Instituição salva com sucesso!");
            return prepararLista();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Erro ao salvar instituição");
            return null;
        }
    }

    public String excluir(Instituicao instituicao) {
        try {
            instituicaoDAO.delete(instituicao);
            JsfUtil.addSuccessMessage("Instituição removida com sucesso!");
            return prepararLista();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "Erro ao excluir instituição");
            return null;
        }
    }

    public String prepararLista() {
        newInstances();
        return "lista";
    }

    public String prepararEdicao(Instituicao instituicao) {
        newInstances();
        this.instituicao = instituicao;
        edicao = true;
        return "edita";
    }

    public String prepararNovo() {
        newInstances();
        edicao = true;
        return "edita";
    }

    public String prepararVer(Instituicao instituicao) {
        newInstances();
        this.instituicao = instituicao;
        edicao = false;
        return "edita";
    }

    public List<Instituicao> getInstituicoes() {
        return instituicaoDAO.listAll();
    }

    private void newInstances() {
        this.instituicao = new Instituicao();
        this.instituicaoDAO = new InstituicaoDAO();
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public InstituicaoDAO getInstituicaoDAO() {
        return instituicaoDAO;
    }

    public boolean isEdicao() {
        return edicao;
    }

    public void setEdicao(boolean edicao) {
        this.edicao = edicao;
    }
}
