package br.com.fafidev.webteca.interfaces;

import java.util.List;

/**
 *
 * @author fernando
 */
public interface Gerenciavel {

    void inserir(Object obj);

    void alterar(Object obj);

    void excluir(Object obj);

    Object recuperar(Object obj);

    List<Object> lista();
}
