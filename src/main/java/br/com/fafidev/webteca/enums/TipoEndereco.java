package br.com.fafidev.webteca.enums;

/**
 *
 * @author fernando
 */
public enum TipoEndereco {

    RESIDENCIAL("Residencial"),
    COMERCIAL("Comercial"),
    VERANEIO("Veraneio"),
    CORRESPONDENCIA("Correspondência");
    private final String descricao;

    private TipoEndereco(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
