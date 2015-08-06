package br.com.fafidev.webteca.entidade;

import br.com.fafidev.webteca.enums.TipoTitulacao;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author fernando
 */
@Entity
public class TituloAcademico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TipoTitulacao tipoTitulacao;
    @ManyToOne
    private Curso curso;

    public TituloAcademico() {
    }

    public TituloAcademico(TipoTitulacao tipoTitulacao, Curso curso) {
        this.tipoTitulacao = tipoTitulacao;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoTitulacao getTipoTitulacao() {
        return tipoTitulacao;
    }

    public void setTipoTitulacao(TipoTitulacao tipoTitulacao) {
        this.tipoTitulacao = tipoTitulacao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TituloAcademico)) {
            return false;
        }
        TituloAcademico other = (TituloAcademico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (this.tipoTitulacao != null && this.curso != null) {
            return this.tipoTitulacao.getNome() + " " + this.curso.getNome();
        }
        return "Título: " + id;
    }
}
