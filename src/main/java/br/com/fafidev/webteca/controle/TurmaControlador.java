package br.com.fafidev.webteca.controle;

import br.com.fafidev.webteca.entidade.Turma;
import br.com.fafidev.webteca.negocio.TurmaDAO;
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
public class TurmaControlador implements Serializable {

    private Turma turma;
    private TurmaDAO turmaDAO;

    public TurmaControlador() {
        this.turma = new Turma();
        this.turmaDAO = new TurmaDAO();
    }

    public String novaTurma() {
        turma = new Turma();
        return "edita.xhtml";
    }

    public String salvarNovo() {
        turmaDAO.save(turma);
        turma = new Turma();
        turmaDAO = new TurmaDAO();
        return "lista.xhtml";
    }

    public List<Turma> getTurmas() {
        return turmaDAO.findAll();
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
