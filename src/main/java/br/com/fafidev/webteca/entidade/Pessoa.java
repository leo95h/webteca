package br.com.fafidev.webteca.entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author fernando
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private Boolean ativo;
    @OneToMany(mappedBy = "pessoa")
    private List<EnderecoPessoa> enderecos;
    @OneToMany(mappedBy = "pessoa")
    private List<TelefonePessoa> telefones;

    public Pessoa() {
        this.enderecos = new ArrayList<>();
        this.telefones = new ArrayList<>();
        this.ativo = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<EnderecoPessoa> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoPessoa> enderecos) {
        this.enderecos = enderecos;
    }

    public List<TelefonePessoa> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefonePessoa> telefones) {
        this.telefones = telefones;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
