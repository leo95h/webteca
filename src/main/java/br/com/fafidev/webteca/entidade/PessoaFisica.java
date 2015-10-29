package br.com.fafidev.webteca.entidade;

import br.com.fafidev.webteca.entidade.util.EstadoCivil;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;

/**
 *
 * @author fernando
 */
@Entity
public class PessoaFisica extends Pessoa {

    private String nome;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date nascimento;
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    public PessoaFisica() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return nome;
    }
}
