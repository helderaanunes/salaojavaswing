package br.com.cafi.salaodesktop.modelo.dao;

import br.com.cafi.salaodesktop.modelo.entidades.Produto;
import br.com.cafi.salaodesktop.modelo.entidades.Servico;
import br.com.cafi.salaodesktop.modelo.entidades.UsuarioPermissao;
import javax.persistence.EntityManager;

public class UsuarioPermissaoDAO extends DAO<Integer, UsuarioPermissao> {
    public UsuarioPermissaoDAO(EntityManager entityManager) {
        super( entityManager);
    }
}