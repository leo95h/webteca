/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafidev.webteca.negocio;

import br.com.fafidev.webteca.entidade.Instituicao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author fernando
 */
public class InstituicaoDAO extends GenericDAO<Instituicao> {

    private final PessoaJuridicaDAO pessoaJuridicaDAO;

    public InstituicaoDAO() {
        super(Instituicao.class);
        this.pessoaJuridicaDAO = new PessoaJuridicaDAO();
    }

    @Override
    public void save(Instituicao entity) {
        try {
            entity.setPessoaJuridica(pessoaJuridicaDAO.merge(entity.getPessoaJuridica()));
            super.save(entity);
        } catch (Exception ex) {
            getLogger().error("Erro ao salvar: " + ex.getMessage(), ex);
        }
    }

    @Override
    public void update(Instituicao entity) {
        try {
            entity.setPessoaJuridica(pessoaJuridicaDAO.merge(entity.getPessoaJuridica()));
            super.update(entity);
        } catch (Exception ex) {
            getLogger().error("Erro ao atualizar: " + ex.getMessage(), ex);
        }
    }

    @Override
    protected Logger getLogger() {
        return LoggerFactory.getLogger(this.getClass());
    }

}
