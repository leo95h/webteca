package br.com.fafidev.webteca.controle;

import br.com.fafidev.webteca.entidade.Aluno;
import br.com.fafidev.webteca.entidade.util.EstadoCivil;
import br.com.fafidev.webteca.negocio.AlunoDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author fernando
 */
@ManagedBean
@SessionScoped
public class AlunoControlador implements Serializable {

    private AlunoDAO alunoDAO;
    private Aluno aluno;

    public AlunoControlador() {
        aluno = new Aluno();
        alunoDAO = new AlunoDAO();
    }

    public String novoAluno() {
        aluno = new Aluno();
        return "edita.xhtml";
    }

    public String salvarNovo() {
        alunoDAO.save(aluno);
        aluno = new Aluno();
        alunoDAO = new AlunoDAO();
        return "lista.xhtml";
    }

    public List<SelectItem> getEstadosCivis() {
        List<SelectItem> itens = new ArrayList<>();
        itens.add(new SelectItem(null, "Selecione..."));
        for (EstadoCivil estadoCivil : EstadoCivil.values()) {
            itens.add(new SelectItem(estadoCivil, estadoCivil.name()));
        }
        return itens;
    }

    public List<Aluno> getListaAlunos() {
        return alunoDAO.findAll();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
