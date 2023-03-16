package br.com.cafi.salaodesktop.modelo.dao;

import br.com.cafi.salaodesktop.modelo.entidades.Produto;
import br.com.cafi.salaodesktop.modelo.entidades.Servico;
import javax.persistence.EntityManager;

public class ProdutoDAO extends DAO<Long, Produto> {
    public ProdutoDAO(EntityManager entityManager) {
        super( entityManager);
    }
}