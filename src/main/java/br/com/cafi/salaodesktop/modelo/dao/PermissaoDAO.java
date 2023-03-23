package br.com.cafi.salaodesktop.modelo.dao;

import br.com.cafi.salaodesktop.modelo.entidades.Permissao;
import javax.persistence.EntityManager;

public class PermissaoDAO extends DAO<Integer, Permissao> {

    public PermissaoDAO(EntityManager entityManager) {
        super(entityManager);
    }
}
