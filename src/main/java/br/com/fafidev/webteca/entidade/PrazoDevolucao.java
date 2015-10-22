package br.com.fafidev.webteca.entidade;

import br.com.fafidev.webteca.entidade.util.TipoPessoa;
import br.com.fafidev.webteca.entidade.util.TipoPublicacao;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author fernando
 */
@Entity
public class PrazoDevolucao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    private Integer dias;
    private BigDecimal valorAtraso;
    private Integer suspensaoAtraso;
    @Enumerated(EnumType.STRING)
    private TipoPublicacao TipoPublicacao;
    @Enumerated(EnumType.STRING)
    private TipoPessoa TipoPessoa;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vigencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof PrazoDevolucao)) {
            return false;
        }
        PrazoDevolucao other = (PrazoDevolucao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fafidev.webteca.entidade.PrazoDevolucao[ id=" + id + " ]";
    }

}
