package br.com.cafi.salaodesktop.modelo.dao;

import br.com.cafi.salaodesktop.modelo.entidades.Servico;
import javax.persistence.EntityManager;

public class ServicoDAO extends DAO<Integer, Servico> {
    public ServicoDAO(EntityManager entityManager) {
        super();
    }
    
}
