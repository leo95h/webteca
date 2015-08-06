package br.com.fafidev.webteca.enums;

/**
 *
 * @author fernando
 */
public enum TipoLogradouro {

    RUA("Rua", "R."),
    AVENIDA("Avenida", "Av."),
    PRACA("Praça", "Pça."),
    ESTRADA("Estrada", "Estr.");

    private TipoLogradouro(String descricao, String sigla) {
        this.descricao = descricao;
        this.sigla = sigla;
    }

    private String descricao;
    private String sigla;

    public String getDescricao() {
        return descricao;
    }

    public String getSigla() {
        return sigla;
    }
}
