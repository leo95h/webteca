package br.com.fafidev.webteca.controle;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author fernando
 */
@ManagedBean
public class UsuarioControlador implements Serializable {

    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
