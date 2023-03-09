package br.com.cafi.salaodesktop.modelo.dao;

import br.com.cafi.salaodesktop.modelo.entidades.Usuario;
import javax.persistence.EntityManager;

public class UsuarioDAO extends DAO<Integer, Usuario> {
    public UsuarioDAO(EntityManager entityManager) {
        super(entityManager);
    }
    
}
