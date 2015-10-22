package br.com.fafidev.webteca.negocio.util;

/**
 *
 * @author fernando
 */
public class ExcecaoNegocio extends RuntimeException {

    public ExcecaoNegocio(String message, Throwable cause) {
        super(message, cause);
    }

}
