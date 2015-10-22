package br.com.fafidev.webteca.entidade.util;

/**
 *
 * @author fernando
 */
public enum TipoDocumento {

    RG("RG - Registro Geral", "9.999.999-9"),
    CPF("CPF - Cadastro de Pessoa Física", "999.999.999-99"),
    CIC("CIC - Sei lá", "999999999");
    private final String descricao;
    private final String mascara;

    private TipoDocumento(String descricao, String mascara) {
        this.descricao = descricao;
        this.mascara = mascara;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMascara() {
        return mascara;
    }

}
