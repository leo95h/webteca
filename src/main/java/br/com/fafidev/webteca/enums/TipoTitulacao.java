package br.com.fafidev.webteca.enums;

/**
 *
 * @author fernando
 */
public enum TipoTitulacao {

    BACHAREL("Bacharel", "Bel."),
    MESTRE("Mestre", "Me."),
    DOUTOR("Doutor", "Dr.");
    private final String nome;
    private final String abreviacao;

    private TipoTitulacao(String nome, String abreviacao) {
        this.nome = nome;
        this.abreviacao = abreviacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

}
