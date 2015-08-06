package br.com.fafidev.webteca.enums;

/**
 *
 * @author fernando
 */
public enum TipoPessoa {

    PROFESSOR("Professor(a)"),
    ALUNO("Aluno(a)"),
    FUNCIONARIO("Funcionário(a)"),
    DIRETOR("Diretor(a)");

    private TipoPessoa(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

}
